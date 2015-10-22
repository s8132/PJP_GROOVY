import groovy.swing.SwingBuilder

import javax.swing.JFrame
import javax.swing.JLabel

import static javax.swing.JFrame.EXIT_ON_CLOSE

def swing = SwingBuilder

SwingBuilder.edtBuilder {
    frame(id: "fra", title: "tytuł", pack: true, show: true, defaultCloseOperation: EXIT_ON_CLOSE, extendedState: JFrame.MAXIMIZED_BOTH){
        gridLayout(columns: 2)
        splitPane(background: java.awt.Color.BLACK){
            panel(background: java.awt.Color.BLACK){
                borderLayout()
                list(id: "li", listData: ["ad", "ds"], valueChanged: { event ->
                    if(event.valueIsAdjusting){
                        lab1.text = li.selectedValue
                    }
                })
            }
            tabbedPane(background: java.awt.Color.BLACK){
                panel(id: "tab1", name: "Tab 1"){
                    label(id: "lab1", text: "tab 1")
                    tree(model: "AAAA")
                }
                panel(name: "Tab 2"){
                    label(text: "tab 2")
                }
                panel(name: "Tab 3"){
                    label(text: "tab 3")
                }
            }
        }
    }
}