package Works.ClassWork.ClassWork24;

public class WaveAlg {

    private int[][] field;
    private int x1;
    private int y1;

    public WaveAlg(int[][] field) {
        this.field = field;
    }

    public Point[] findTheWay(int x, int y, int x1, int y1) {
        System.out.println("1) начальный");
        printField();

        field[y][x] = 1;
        this.x1 = x1;
        this.y1 = y1;

        boolean wasChanged = true;

        while (wasChanged) {
            wasChanged = false;

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {

                    if (isActiveField(j, i)) {
                        if (moveWaveFurther(j, i)) {
                            wasChanged = true;

                            Point[] res = allBackWay();
                            if (res != null) {
                                System.out.println("2) маршрут ");
                                markPath(res);
                                printFieldWithPath(res);
                                return res;
                            }
                        }
                    }
                }
            }
            System.out.println("3) промежуточный ");
            printField();
        }
        return null;
    }

    public Point[] allBackWay() {
        Point p = backWayCheck(this.x1, this.y1);

        if (p == null) {
            return null;
        }

        int chainLength = field[p.getY()][p.getX()] - 1;

        Point[] res = new Point[chainLength];
        res[0] = p;

        for (int i = 1; i < chainLength; i++) {
            res[i] = backWayCheck(res[i - 1].getX(), res[i - 1].getY());
        }

        return res;
    }

    public Point backWayCheck(int x, int y) {
        Point p = null;
        int min = 100000;

        if (x > 0) {
            if (field[y][x - 1] > 0 && field[y][x - 1] < min) {
                p = new Point(x - 1, y);
                min = field[y][x - 1];
            }
        }

        if (y > 0) {
            if (field[y - 1][x] > 0 && field[y - 1][x] < min) {
                min = field[y - 1][x];
                p = new Point(x, y - 1);
            }
        }

        if (x < field[y].length - 1) {
            if (field[y][x + 1] > 0 && field[y][x + 1] < min) {
                min = field[y][x + 1];
                p = new Point(x + 1, y);
            }
        }

        if (y < field.length - 1) {
            if (field[y + 1][x] > 0 && field[y + 1][x] < min) {
                min = field[y + 1][x];
                p = new Point(x, y + 1);
            }
        }
        return p;
    }

    public boolean isActiveField(int x, int y) {
        return field[y][x] > 0;
    }

    public boolean moveWaveFurther(int x, int y) {
        boolean res = false;
        if (x > 0) {
            if (field[y][x - 1] == 0) {
                field[y][x - 1] = field[y][x] + 1;
                res = true;
            }
        }

        if (y > 0) {
            if (field[y - 1][x] == 0) {
                field[y - 1][x] = field[y][x] + 1;
                res = true;
            }
        }

        if (x < field[y].length - 1) {
            if (field[y][x + 1] == 0) {
                field[y][x + 1] = field[y][x] + 1;
                res = true;
            }
        }

        if (y < field.length - 1) {
            if (field[y + 1][x] == 0) {
                field[y + 1][x] = field[y][x] + 1;
                res = true;
            }
        }
        return res;
    }

    private void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                printValue(field[i][j]);
            }
            println();
        }
    }

    private void printFieldWithPath(Point[] path) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (isPointInPath(j, i, path)) {
                    System.out.print(" * "); //тут маршрут будет в виде звезд
                } else {
                    printValue(field[i][j]);
                }
            }
            println();
        }
    }

    private boolean isPointInPath(int x, int y, Point[] path) {
        for (Point p : path) {
            if (p.getX() == x && p.getY() == y) {
                return true;
            }
        }
        return false;
    }

    private void printValue(int v) {
        if (v == -1) {
            System.out.print("###");
        } else if (v == 0) {
            System.out.print("   ");
        } else if (v == 1) {
            System.out.print(" S ");
        } else if (v == 2) {
            System.out.print(" F ");
        } else if (v < 10) {
            System.out.print("  " + v);
        } else {
            System.out.print(" " + v);
        }
    }

    private void println() {
        System.out.println();
    }

    private boolean isFinish(int x, int y) {
        return (this.x1 == x && this.y1 == y);
    }

    private void markPath(Point[] path) {
        for (Point p : path) {
            field[p.getY()][p.getX()] = 9;
        }
        field[y1][x1] = 2;
    }
}