package com.idosth.file.export;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

/**
 * 文件右击菜单Demo，Export按钮，位于剪切复制粘贴组最后
 */
public class FileExportAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        MainDialogWrapper dialog = new MainDialogWrapper(event);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialog.requestFocus();
    }
}
