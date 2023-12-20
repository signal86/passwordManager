package me.sig86.passwordManager

import java.awt.EventQueue


private fun createAndShowGUI() {

    val frame = PasswordManagerGUI()
    frame.isVisible = true

}


fun main() {

    EventQueue.invokeLater(::createAndShowGUI)

}