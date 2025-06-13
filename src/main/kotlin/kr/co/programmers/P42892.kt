package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/662
class P42892 {
    fun solution(nodeinfo: Array<IntArray>): Array<IntArray> {
        // X 좌표 기준으로 정렬한다.
        val sorted = nodeinfo
            .mapIndexed { i, it -> intArrayOf(i, it[0], it[1]) }
            .sortedBy { it[1] /* x 좌표 */ }

        // 첫번쨰 좌표를 최상위, 이전 노드로 두고 시작
        val first = sorted.first()
        // 최상위 노드
        var root = TreeNode(first[0] + 1, first[2])
        // 이전 노드
        var prev: TreeNode = root

        // 두번째부터 시작
        for ((i, _, y) in sorted.drop(1)) {
            // 현재 노드
            val node = TreeNode(n = i + 1, y = y)
            // 이전노드가 있으면 비교
            if (prev.y > node.y) { // 현재 노드가 이전 노드보다 아래에 있다
                prev.right = node
                node.parent = prev
            } else { // 현재 노드가 이전 노드보다 위에 있다
                // 이전 노드의 상위 노드중에 현재 노드보다 높은 노드를 찾는다.
                var parent: TreeNode? = prev
                while (parent != null) {
                    if (parent.y > node.y) {
                        // 현재 노드보다 높은 상위 노드를 찾음
                        // [찾은 상위노드]와 [찾은 상위노드의 오른쪽 노드] 사이에 현재 노드를 연결한다.
                        val tmp = parent.right
                        parent.right = node
                        node.parent = parent
                        node.left = tmp
                        tmp?.parent = node
                        break
                    } else if (parent.parent == null) {
                        // 더이상 상위 노드가 없다
                        // 현재 노드가 가장 상위 노드다
                        parent.parent = node
                        node.left = parent
                        break
                    } else { // 다음 상위 노드
                        parent = parent.parent
                    }
                }
            }
            if (node.y > root.y) {
                root = node
            }
            prev = node
        }
        // 전위 순회
        val preorderPath = mutableListOf<Int>()
        preorder(root, preorderPath)
        // 후위 순회
        val postorderPath = mutableListOf<Int>()
        postorder(root, postorderPath)

        return arrayOf(
            preorderPath.toIntArray(),
            postorderPath.toIntArray()
        )
    }

    /** 전위 순회 : 나 → 왼쪽 → 오른쪽 */
    private fun preorder(node: TreeNode?, result: MutableList<Int>) {
        if (node == null) return

        result.add(node.n)
        preorder(node.left, result)
        preorder(node.right, result)
    }

    /** 후위 순회 : 왼쪽 → 오른쪽 → 나 */
    private fun postorder(node: TreeNode?, result: MutableList<Int>) {
        if (node == null) return
        postorder(node.left, result)
        postorder(node.right, result)
        result.add(node.n)
    }

    data class TreeNode(
        val n: Int,
        val y: Int,
    ) {
        var left: TreeNode? = null
        var right: TreeNode? = null
        var parent: TreeNode? = null
    }
}