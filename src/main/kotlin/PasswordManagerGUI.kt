package me.sig86.passwordManager

import java.awt.Color
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.JComponent
import javax.swing.GroupLayout


class PasswordManagerGUI : JFrame() {

    private lateinit var userPanel: JPanel

    init {
        setSize(800, 560)
        userUI()
    }

    private fun userUI() {

        setTitle("Simple Password Manager")

        userPanel = JPanel()


        //


        contentPane.background = Color(0x000000)
        userPanel.background = Color(0x000000)

        defaultCloseOperation = EXIT_ON_CLOSE
        userPanel.setSize(800, 560)
        setLocationRelativeTo(null)
        createLayout(userPanel, JTextField())

    }

    private fun createLayout(panel: JPanel, vararg arg: JComponent) {

        contentPane.removeAll()
        contentPane.revalidate()

        val gl = GroupLayout(panel)
        panel.layout = gl

        gl.autoCreateContainerGaps = true
        gl.autoCreateGaps = true

        if (panel == userPanel) {

            gl.setHorizontalGroup(
                gl.createSequentialGroup()
                    .addGroup(
                        gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(arg[0])
                    )
            )

            gl.setVerticalGroup(
                gl.createSequentialGroup()
                    .addGroup(
                        gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(arg[0])
                    )
            )

        }

        // using pack resizes the screen to fit perfectly
        add(panel)
        val a = getSize()
        pack()
        setMinimumSize(a)

    }

}