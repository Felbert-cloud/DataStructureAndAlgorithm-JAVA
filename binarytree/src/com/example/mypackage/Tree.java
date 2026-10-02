package com.example.mypackage;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public void insert(int n) {
        if (this.root == null) {
            this.root = new Node(n);
            return;
        }

        Node current = this.root;

        while (true) {
            if (n < current.data) {
                if (current.left == null) {
                    current.left = new Node(n);
                    return;
                } else {
                    current = current.left;
                }
            } else if (n > current.data) {
                if (current.right == null) {
                    current.right = new Node(n);
                    return;
                } else {
                    current = current.right;
                }
            }
        }

    }

    public boolean remove(int targetValue) {
        Node current = this.root;
        Node prev = current;
        while (true) {
            if (current.data == targetValue) {
                Node deletingNodeLeft = current.left;
                Node deletingNodeRight = current.right;
                if (deletingNodeRight == null) {
                    prev.right = deletingNodeLeft;
                    return true;
                }
                prev.right = deletingNodeRight;
                return true;
            }
            if (targetValue < current.data) {
                if (this.isDirectionNull(current, "left")) {
                    return false;
                }
                prev = current;
                current = current.left;
            } else {
                if (this.isDirectionNull(current, "right")) {
                    return false;
                }
                prev = current;
                current = current.right;
            }

        }
    }

    private boolean isDirectionNull(Node node, String check) {
        boolean isLeft = false;
        if (check == "left") {
            isLeft = true;
        }

        if (isLeft) {
            if (node.left == null) {
                return true;
            }
        }
        if (!isLeft) {
            if (node.right == null) {
                return true;
            }
        }
        return false;

    }

    public boolean search(int target) {
        Node current = this.root;
        boolean find = false;
        while (!find) {
            if (current.data == target) {
                find = true;
                return true;
            }
            if (current.right == null && current.left == null) {
                return false;
            }
            if (current.data <= target) {
                current = current.left;
            } else if (current.data >= target) {
                current = current.right;
            }
        }
        return false;
    }

    public void print() {
        if (this.root == null) {
            System.out.println("(empty tree)");
            return;
        }
        class Printer {
            int height(Node n) {
                if (n == null)
                    return 0;
                int lh = height(n.left);
                int rh = height(n.right);
                return 1 + (lh > rh ? lh : rh);
            }

            int maxLen(Node n) {
                if (n == null)
                    return 0;
                int cur = String.valueOf(n.data).length();
                int l = maxLen(n.left);
                int r = maxLen(n.right);
                int m = cur > l ? cur : l;
                return m > r ? m : r;
            }

            void printTree(Node root) {
                int h = height(root);
                int digitW = maxLen(root);
                int cellW = digitW + 2;
                if (cellW < 4)
                    cellW = 4;
                int total = cellW * (1 << h);
                java.util.List<java.util.List<Node>> levels = new java.util.ArrayList<>();
                java.util.List<Node> cur = new java.util.ArrayList<>();
                cur.add(root);
                for (int d = 0; d < h; d++) {
                    levels.add(new java.util.ArrayList<>(cur));
                    java.util.List<Node> next = new java.util.ArrayList<>();
                    for (Node n : cur) {
                        if (n == null) {
                            next.add(null);
                            next.add(null);
                        } else {
                            next.add(n.left);
                            next.add(n.right);
                        }
                    }
                    cur = next;
                }
                for (int d = 0; d < h; d++) {
                    int nodes = 1 << d;
                    int step = total / nodes;
                    char[] line = new char[total];
                    java.util.Arrays.fill(line, ' ');
                    for (int j = 0; j < nodes; j++) {
                        Node n = levels.get(d).get(j);
                        if (n == null)
                            continue;
                        String s = String.valueOf(n.data);
                        int center = j * step + step / 2;
                        int start = center - s.length() / 2;
                        for (int k = 0; k < s.length(); k++) {
                            int p = start + k;
                            if (p >= 0 && p < total)
                                line[p] = s.charAt(k);
                        }
                    }
                    int end = total - 1;
                    while (end >= 0 && line[end] == ' ')
                        end--;
                    if (end >= 0)
                        System.out.println(new String(line, 0, end + 1));
                    if (d < h - 1) {
                        char[] edge = new char[total];
                        java.util.Arrays.fill(edge, ' ');
                        int childStep = step / 2;
                        for (int j = 0; j < nodes; j++) {
                            Node p = levels.get(d).get(j);
                            if (p == null)
                                continue;
                            Node l = levels.get(d + 1).get(2 * j);
                            Node r = levels.get(d + 1).get(2 * j + 1);
                            int parentCenter = j * step + step / 2;
                            int leftCenter = (2 * j) * childStep + childStep / 2;
                            int rightCenter = (2 * j + 1) * childStep + childStep / 2;
                            if (l != null) {
                                int slashPos = (parentCenter + leftCenter) / 2;
                                if (slashPos >= 0 && slashPos < total)
                                    edge[slashPos] = '/';
                            }
                            if (r != null) {
                                int backPos = (parentCenter + rightCenter) / 2;
                                if (backPos >= 0 && backPos < total)
                                    edge[backPos] = '\\';
                            }
                        }
                        int eEnd = total - 1;
                        while (eEnd >= 0 && edge[eEnd] == ' ')
                            eEnd--;
                        if (eEnd >= 0)
                            System.out.println(new String(edge, 0, eEnd + 1));
                    }
                }
            }
        }
        new Printer().printTree(this.root);
    }

    public void binaryToLinklist() {

    }

}
