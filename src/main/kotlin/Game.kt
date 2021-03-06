class Game {
    var level: Array<String> = arrayOf(
        "*****",
        "*.*.*",
        "*....P",
        "**.@*",
        "*****"
    )
    private var pRow = 3
    private var pCol = 3
    private var goalRow = 2
    private var goalCol = 5

    fun draw() {
        for (row in level) {
            for (str in row)
                print(str)
            println()
        }
    }



    fun moveUp() {
        while ( pRow - 1 >= 0 && level[pRow-1][pCol] != '*')
        {
            if (this.checkWin()) this.win()
            if (pRow - 1 >= 0) {
                level[pRow] = setCharAt(level[pRow], pCol, '.')
                pRow--
                level[pRow] = setCharAt(level[pRow], pCol, '@')
                println("1칸이동")
            }
        }


    }



    fun moveDown() {
        while(pRow + 1 < level.size && level[pRow+1][pCol] != '*') {
            if(this.checkWin()) this.win()
            if(pRow + 1 < level.size) {
                level[pRow] = setCharAt(level[pRow], pCol, '.')
                pRow++
                level[pRow] = setCharAt(level[pRow], pCol, '@')
                println("1칸이동")
            }
        }
    }

    fun moveLeft() {
        while (pCol - 1 > 0 && level[pRow][pCol - 1] != '*') {
            if(this.checkWin()) this.win()
            if (pCol - 1 > 0) {
                level[pRow] = setCharAt(level[pRow], pCol, '.')
                pCol--
                level[pRow] = setCharAt(level[pRow], pCol, '@')
                println("1칸이동")
            }
        }
    }

    private fun win() {
        println("You win")
        System.exit(0)
    }

    private fun checkWin(): Boolean {
        return pRow == goalRow && pCol == goalCol
    }

    fun moveRight() {

        while (pCol + 1 < level[pRow].length && level[pRow][pCol + 1] != '*') {
            if(this.checkWin()) this.win()
            if (pCol + 1 < level[pRow].length) {
                level[pRow] = setCharAt(level[pRow], pCol, '.')
                pCol++
                level[pRow] = setCharAt(level[pRow], pCol, '@')
                println("1칸이동")
            }
        }
    }

    fun reset() {
        TODO("Not yet implemented")
    }

    private fun setCharAt(str : String, position : Int, ch : Char): String {
        var sb = StringBuilder(str)
        sb.setCharAt(position, ch)
        return sb.toString();
    }

    fun isWin(): Boolean {
        return pRow == goalRow && pCol == goalCol
    }
}