package Baekjoon.Class04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    char data;
    Node left;
    Node right;

    public Node(char data) {
        this.data = data;
    }
}

class Tree {
    public Node rootNode;
    public void createNode(char rootData, char leftData, char rightData) {
        if (rootNode == null) {
            rootNode = new Node(rootData);
            rootNode.left = leftData == '.' ? null : new Node(leftData);
            rootNode.right = rightData == '.' ? null : new Node(rightData);
        } else {
            addNode(rootNode, rootData, leftData, rightData);
        }
    }

    public void addNode(Node root, char rootData, char leftData, char rightData) {
        if (root == null) {
            return;
        } else if (root.data == rootData) {
            root.left = leftData == '.' ? null : new Node(leftData);
            root.right = rightData == '.' ? null : new Node(rightData);
        } else{
            addNode(root.left, rootData, leftData, rightData);
            addNode(root.right, rootData, leftData, rightData);
        }
    }

    // 전위 탐색
    public void preOrder(Node node){
        if (node != null) {
            System.out.print(node.data);
            if (node.left != null) preOrder(node.left);
            if (node.right != null) preOrder(node.right);
        }
    }
    // 중위 탐색
    public void inOrder(Node node){
        if (node != null) {
            if (node.left != null) inOrder(node.left);
            System.out.print(node.data);
            if (node.right != null) inOrder(node.right);
        }

    }
    // 후위 탐색
    public void postOrder(Node node){
        if (node != null) {
            if (node.left != null) postOrder(node.left);
            if (node.right != null) postOrder(node.right);
            System.out.print(node.data);
        }
    }
}

public class TreeCircuit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Tree t = new Tree();

        // 값 입력 받아 트리 생성
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            t.createNode(root, left, right);
        }

        // 전위 순회 출력
        t.preOrder(t.rootNode);
        System.out.println();

        // 중위 순회 출력
        t.inOrder(t.rootNode);
        System.out.println();

        // 후위 순회 출력
        t.postOrder(t.rootNode);
    }
}
