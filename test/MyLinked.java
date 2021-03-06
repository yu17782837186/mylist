package com.ning.linked;

import java.util.Hashtable;

public class MyLinked {
//    private Node head = new Node();
//    private int size;
//    public int size() {
//        return size;
//    }
//    public boolean isEmpty() {
//        return size == 0;
//    }
//    public Object get(int i) {
//        Node p = head.next;
//        for (int j = 0; j < i; j++) {
//            p = p.next;
//        }
//        return p.data;
//    }
//    public boolean contains(Object key) {
//        Node p = head.next;
//        for (int i = 0; i < size; i++) {
//            if (p.data == key) {
//                return true;
//            }
//            p = p.next;
//        }
//        return false;
//    }
//    public int index(Object key) {
//        Node p = head.next;
//        for (int i = 0; i < size; i++) {
//            if (p.data == key) {
//                return i;
//            }else {
//                p = p.next;
//            }
//        }
//        return -1;
//    }
//    public void add(int i,Object key) {
//        Node node = new Node(key);
//        Node p = head;
//        for (int j = 0; j < i; j++) {
//            p = p.next;
//        }
//        node.next = p.next;
//        p.next = node;
//        size++;
//    }
//    public void add(Object key) {
//        add(size,key);
//    }
//    public boolean addAfter(Object obj,Object key) {
//        Node p = head.next;
//        Node node = new Node(key);
//        for (int i = 0; i < size; i++) {
//            if (p.data == obj) {
//                node.next = p.next;
//                p.next = node;
//                size++;
//                return true;
//            }
//            p = p.next;
//        }
//        return false;
//    }
//    public boolean addBefore(Object obj,Object key) {
//        Node p = head.next;
//        Node pre = head;
//        Node node = new Node(key);
//        for (int i = 0; i < size; i++) {
//            if (p.data == obj) {
//                node.next = p;
//                pre.next = node;
//                size++;
//                return true;
//            }else {
//                p = p.next;
//                pre = pre.next;
//            }
//        }
//        return false;
//    }
//    public Object rem(int i) {
//        Node p = head.next;
//        Node pre = head;
//        Object data = null;
//        for (int j = 0; j < i; j++) {
//            p = p.next;
//            pre = pre.next;
//        }
//        data = p.data;
//        pre.next = p.next;
//        size--;
//        return  data;
//    }
//    public boolean remFirst(Object key) {
//        Node p = head.next;
//        Node pre = head;
//        for (int i = 0; i < size ; i++) {
//            if (p.data == key) {
//                pre.next = p.next;
//                size--;
//                break;
//            }else {
//                p = p.next;
//                pre = pre.next;
//            }
//        }
//        return true;
//    }
//    public Object rep(int i,Object key) {
//        Node p = head.next;
//        Object data = null;
//        for (int j = 0; j < i; j++) {
//            p = p.next;
//        }
//        data = p.data;
//        p.data = key;
//        return data;
//    }
//    public void tostring() {
//        Node p = head.next;
//        for (int i = 0; i < size; i++) {
////            if (i != size-1) {
////                System.out.print(p.data+",");
////                p = p.next;
////            }else {
////                System.out.print(p.data);
////                p = p.next;
////            }
//            if (p != null) {
//                System.out.print(p.data+" ");
//                p = p.next;
//            }
//        }
//        System.out.println();
//    }
//    //链表的反转
//    public void reverse() {
//        Node preRe = head.next;
//        Node pNode = head.next;
//        Node pre = null;
//        while(pNode != null) {
//            Node pNext = pNode.next;
//            if (pNext == null) {
//                preRe = pNode;
//            }
//            pNode.next = pre;
//            pre = pNode;
//            pNode = pNext;
//        }
//        this.head = preRe;
//    }
//    //删除链表中重复的数据
//    public void delCopy() {
//        Hashtable<Object,Object> table = new Hashtable<>();
//        Node tmp = head.next;
//        Node pre = null;
//        while(tmp != null) {
//            if (table.containsKey(tmp.data)) {
//                pre.next = tmp.next;
//            }else {
//                table.put(tmp.data,1);
//                pre = tmp;
//            }
//            tmp = tmp.next;
//        }
//    }
//    //找倒数第k个节点
//    public Node findKey(int k) {
//        if (k < 1) {
//            return null;
//        }
//        Node p = head.next;
//        Node q = head.next;
//        for (int i = 0; i < k-1 && p != null; i++) {
//            p = p.next;
//        }
//        if (p == null) {
//            return null;
//        }
//        while(p.next != null) {
//            p = p.next;
//            q = q.next;
//        }
//        return q;
//    }
//    //找中间节点
//    public Node searchMid() {
//        Node p = head.next;
//        Node q = head.next;
//        if (p == null) {
//            return  null;
//        }
//        while(p != null && p.next != null && p.next.next != null) {
//            p = p.next.next;
//            q = q.next;
//        }
//        return q;
//    }
//   //如何检测一个链表是否有环
//    public boolean isLoop() {
//        Node fast = head.next;
//        Node slow = head.next;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                return true;
//            }
//        }
//        return false;
//    }
    private Node head = new Node();
    private int size;
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public Object get(int index) {
        // 1 2 3 4 5
        Node p = head.next;
        for(int i = 0;i < index;i++) {
            p = p.next;
        }
        return p.data;
    }
    public boolean contains(Object key) {
        Node p = head.next;
        for(int i = 0;i < size;i++) {
            if(p.data == key) {
                return true;
            }
            p = p.next;
        }
        return  false;
    }
    public int getObject(Object key) {
        Node p = head.next;
        for(int i = 0;i < size;i++) {
            if(p.data == key) {
                return i;
            }
            p = p.next;
        }
        return -1;
    }
    public void add(int index,Object key) {
        // null 9 5 2 7
        Node p = head;
        Node node = new Node(key);
        for(int i = 0;i < index;i++) {
            p = p.next;
        }
        node.next = p.next;
        p.next = node;
        size++;
    }
    public void add(Object key) {
        add(size,key);
    }
    public boolean addFirst(Object obj,Object key) {
        Node node = new Node(key);
        Node pre = head;
        Node p = head.next;
        for(int i = 0;i < size;i++) {
            if(p.data == obj) {
                node.next = pre.next;
                pre.next = node;
                size++;
                return true;
            }
            p = p.next;
            pre = pre.next;
        }
        return false;
    }
    public boolean addAfter(Object obj,Object key) {
        Node p = head.next;
        Node node = new Node(key);
        for(int i = 0;i < size;i++) {
            if(p.data == obj) {
                node.next = p.next;
                p.next = node;
                size++;
                return true;
            }
            p = p.next;
        }
        return false;
    }
    public Object rem(int index) {
        // null 9 5 2 7
        Node pre = head;
        Node p = head.next;
        Object data = null;
        for(int i = 0;i < index;i++) {
            p = p.next;
            pre = pre.next;
        }
        data = p.data;
        pre.next = p.next;
        size--;
        return data;
    }
    public boolean remFirst(Object key) {
        Node p = head.next;
        Node pre = head;
        boolean flag = false;
        for(int i = 0;i < size;i++) {
            if(p.data == key) {
                pre.next = p.next;
                size--;
                flag = true;
                break;
            }else {
                p = p.next;
                pre = pre.next;
            }
        }
        if(flag) {
            return true;
        }
        return false;
    }
    public Object remIndexObject(int index,Object key) {
        Node p = head.next;
        Node pre = head;
        Object data = null;
        // null 9 5 2 7
        for(int i = 0;i < index;i++) {
            p = p.next;
            pre = pre.next;
        }
        data = p.data;
        pre.next = p.next;
        size--;
        return data;
    }
    public void string() {
        Node tmp = head.next;
        while(tmp != null) {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    //反转链表
    public void reverse() {
        Node preverHead = head.next;
        Node pNode = head.next;
        Node pre = null;
        while(pNode != null) {
            Node pNext  = pNode.next;
            if(pNext == null) {
                preverHead = pNode;
            }
            pNode.next = pre;
            pre = pNode;
            pNode = pNext;
        }
        this.head.next = preverHead;
    }
    //删除链表中重复的数据
    public void delCopy() {
        Hashtable<Object,Object> table = new Hashtable<>();
        Node current = head.next;
        Node pre = null;
        while(current != null) {
            if(table.containsKey(current.data)) {
                pre.next = current.next;
            }else {
                table.put(current.data,1);
                pre = current;
            }
            current = current.next;
        }
    }
    //找倒数第K个节点
    public Node findK(int k) {
        if(k <= 0) {
            return null;
        }
        Node p = head.next;
        Node q = head.next;
        for(int i = 0;i < k-1 && p != null;i++) {
            p = p.next;
        }
        if(p == null) {
            return null;
        }
        while(p.next != null) {
            p = p.next;
            q= q.next;
        }
        return q;
    }
    //找中间节点
    public Node getMid() {
        Node fast = head.next;
        Node slow = head.next;
        if(fast == null) {
            return null;
        }
        while(fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //如何检测一个链表是否有环
    public boolean isLoop() {
        Node fast  = head.next;
        Node slow = head.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
