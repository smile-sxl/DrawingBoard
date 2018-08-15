package com.smile.drawingboard;

import android.graphics.Paint;
import android.graphics.Path;

/**
 * author: smile .
 * date: On 2018/8/5
 */
public class DrawPathInfo {

    private Paint paint;

    private Path path;

    public DrawPathInfo(Paint paint, Path path) {
        this.paint = paint;
        this.path = path;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
}
