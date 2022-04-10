package com.leetcode;

import com.leetcode.P94.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P94Test {
    private final P94 p = new P94();

    @Test
    void example01() {
        TreeNode root = new TreeNode(
                1,
                null,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        null
                )
        );
        assertThat(p.inorderTraversal(root), is(Arrays.asList(1, 3, 2)));
    }

    @Test
    void example02() {
        TreeNode root = null;
        assertThat(p.inorderTraversal(root), is(Collections.emptyList()));
    }

    @Test
    void example03() {
        TreeNode root = new TreeNode(1);
        assertThat(p.inorderTraversal(root), is(Collections.singletonList(1)));
    }

}
