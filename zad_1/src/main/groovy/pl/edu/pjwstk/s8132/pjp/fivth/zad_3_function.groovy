package pl.edu.pjwstk.s8132.pjp.fivth

import groovy.io.FileType

def String startPath = "/Users/Marcin/PJWSTK/PJP/Cwiczenia".replaceAll("/", File.separator)

File.metaClass.eachFilesRecurseMatch = {FileType fileType, FilenameFilter filter, Closure closure ->
    if (!delegate.exists())
        throw new FileNotFoundException(delegate.getAbsolutePath());
    if (!delegate.isDirectory())
        throw new IllegalArgumentException("The provided File object is not a directory: " + delegate.getAbsolutePath());

    final File[] files = delegate.listFiles();
    if (files == null) return;

    for (File file : files) {
        if (file.isDirectory()) {
            if (fileType != FileType.FILES) closure.call(file);
            file.eachFilesRecurseMatch(fileType, filter, closure);
        } else if (fileType != FileType.DIRECTORIES && filter.accept(file, file.name)) {
            closure.call(file);
        }
    }
}

File.metaClass.listFilesRecur = { FilenameFilter filter ->
    ArrayList<File> files = new ArrayList<>();
    for(File file: delegate.listFiles()){
        if(file.directory){
            files.addAll(file.listFilesRecur(filter));
        }else if ((filter == null) || filter.accept(file, file.name)){
            files.add(file);
        }
    }
    files.toArray(new File[files.size()]);
}

def filter = new FilenameFilter() {
    @Override
    boolean accept(File dir, String name) {
        name.endsWith(".html")
    }
}


new File(startPath).eachFilesRecurseMatch(FileType.FILES, filter){ println it}

new File(startPath).listFilesRecur(filter).eachWithIndex { File entry, int i ->
    println "${i+1} $entry"
}