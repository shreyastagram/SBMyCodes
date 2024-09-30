package BinaryTree.fullBinaryTreeImplementation;

class Array<T extends Comparable<T>> {
    private Character[][] array;
    private final String title;
    public final int numberOfColumns;
    public final int numberOfRows;

    public Array() {
        this.numberOfRows = 1;
        this.numberOfColumns = 3;
        this.array = new Character[this.numberOfRows][this.numberOfColumns];
        this.array[0][0] = ' ';
        this.array[0][1] = ' ';
        this.array[0][2] = ' ';
        this.title = "";
    }

    public Array(Node<T> node) {
        Array<T> left = new Array<>();
        Array<T> right = new Array<>();

        if (node.getLeft() != null) {
            left = new Array<>(node.getLeft());
        }
        if (node.getRight() != null) {
            right = new Array<>(node.getRight());
        }

        this.title = node.getValue().toString(); // Assuming node.getValue() returns a T

        this.numberOfColumns = Math.max(title.length(), left.numberOfColumns + right.numberOfColumns + 1);
        this.numberOfRows = Math.max(left.numberOfRows, right.numberOfRows) + 4;

        this.array = new Character[this.numberOfRows][this.numberOfColumns];

        // Initialize array with spaces
        for (int row = 0; row < this.numberOfRows; row++) {
            for (int col = 0; col < this.numberOfColumns; col++) {
                this.array[row][col] = ' ';
            }
        }

        // Place hangers
        this.array[1][this.numberOfColumns / 2] = '|';

        int startBars = left.numberOfColumns / 2;
        int numberOfBars = (left.numberOfColumns / 2) + 3 + (right.numberOfColumns / 2);
        for (int i = 0; i < numberOfBars; i++) {
            this.array[2][startBars + i] = '-';
        }
        this.array[3][startBars] = '|';
        this.array[3][startBars + numberOfBars - 1] = '|';

        // Transfer left subtree
        for (int row = 0; row < left.numberOfRows; row++) {
            for (int col = 0; col < left.numberOfColumns; col++) {
                this.array[row + 4][col] = left.get(row, col);
            }
        }

        // Transfer right subtree
        int xshift = 1 + left.numberOfColumns;
        for (int row = 0; row < right.numberOfRows; row++) {
            for (int col = 0; col < right.numberOfColumns; col++) {
                this.array[row + 4][col + xshift] = right.get(row, col);
            }
        }

        // Place title
        int startTitle = (this.numberOfColumns - title.length()) / 2;
        for (int i = 0; i < title.length(); i++) {
            this.array[0][startTitle + i] = title.charAt(i);
        }
    }

    public Character get(int row, int col) {
        return this.array[row][col];
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int row = 0; row < this.numberOfRows; row++) {
            for (int col = 0; col < this.numberOfColumns; col++) {
                s.append(this.array[row][col]);
            }
            s.append('\n');
        }
        return s.toString();
    }

    // Add a method for getting the title if needed
    public String getTitle() {
        return this.title;
    }
}
