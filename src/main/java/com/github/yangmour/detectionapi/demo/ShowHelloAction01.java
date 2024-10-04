package com.github.yangmour.detectionapi.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class ShowHelloAction01 extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        String message = "你好，秀一下";
        Messages.showInfoMessage(e.getProject(), message, "标题");
    }
}
