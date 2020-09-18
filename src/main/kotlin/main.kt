import java.util.*

fun main(args: Array<String>) {

    var level = arrayOf(
        arrayOf('*', '*', '*', '*', '*'),
        arrayOf('*', '.', '.', '.', '*'),
        arrayOf('*', '.', '.', '.', '*'),
        arrayOf('*', '.', '.', '.', '*'),
        arrayOf('*', '*', '*', '*', '*')
    )
    var playerX = 2
    var playerY = 2
    level[playerX][playerY] = '@'

    var key = '0'
    var sc = Scanner(System.`in`)
    while (key != 'q') {
        draw(level)
        println()
        print("input(quit: q, reset: r) > ")
        key = sc.nextLine()[0]
        if (key == 'w') {
            level = move(level, playerX, playerY, -1, 0)
            playerX--
            println(
                "up \n" +
                        "currentX: $playerX\n" +
                        "currentY: $playerY\n"
            )
        } else if (key == 'a') {
            level = move(level, playerX, playerY, 0, -1)
            playerY--
            println(
                "left \n" +
                        "currentX: $playerX\n" +
                        "currentY: $playerY\n"
            )
        } else if (key == 's') {
            level = move(level, playerX, playerY, 1, 0)
            playerX++
            println(
                "down \n" +
                        "currentX: $playerX\n" +
                        "currentY: $playerY\n"
            )
        } else if (key == 'd') {
            level = move(level, playerX, playerY, 0, 1)
            playerY++
            println(
                "right \n" +
                        "currentX: $playerX\n" +
                        "currentY: $playerY\n"
            )
        } else if (key == 'r') {
            level = arrayOf(
                arrayOf('*', '*', '*', '*', '*'),
                arrayOf('*', '.', '.', '.', '*'),
                arrayOf('*', '.', '.', '.', '*'),
                arrayOf('*', '.', '.', '.', '*'),
                arrayOf('*', '*', '*', '*', '*')
            )
        } else {
            println("invaild input detected: $key")
        }
    }
}


fun move(level: Array<Array<Char>>,
         playerX: Int, playerY: Int,
         distanceX: Int, distanceY: Int): Array<Array<Char>> {
    var result = level
    var destX = playerX + distanceX
    var destY = playerY + distanceY
    var tmp = result[playerX][playerY]
    result[playerX][playerY] = result[destX][destY]
    result[destX][destY] = tmp
    return result
}


fun draw(level: Array<Array<Char>>) {
    for (element in level) {
        for (element in element) {
            print(element)
        }
        println()
    }
}