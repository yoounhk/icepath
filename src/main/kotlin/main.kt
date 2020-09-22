import java.util.*

fun main(args: Array<String>) {

    var game = Game()
    
    var key = '0'
    var sc = Scanner(System.`in`)
    while (key != 'q') {
        game.draw() // 움직일때 마다 draw() 하기
        println()
        print("input(quit: q, reset: r) > ")
        key = sc.nextLine()[0] // TODO: 입력 좀 더 스마트하게 받기
        when (key) {
            'w' -> game.moveUp()
            's' -> game.moveDown()
            'a' -> game.moveLeft()
            'd' -> game.moveRight()
            'r' -> game = Game() // TODO Game.reset() 만들기
            else -> println("invalid input detected: $key")
        }
    }
}
