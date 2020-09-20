import java.util.*

// TODO Point, Level 클래스 만들기
fun main(args: Array<String>) {

    var game = Game()

    var key = '0'
    var sc = Scanner(System.`in`)
    while (key != 'q') {
        if (game.isWin()) {
            println("승리")
            return
        }
        game.draw()
        println()
        print("input(quit: q, reset: r) > ")
        key = sc.nextLine()[0] // TODO: 입력 좀 더 스마트하게 받기
        if (key == 'w') { // TODO: 코드 분리하기
            game.moveUp()
        } else if (key == 's') {
            game.moveDown()
        } else if (key == 'a') {
            game.moveLeft()
        } else if (key == 'd') {
            game.moveRight()
        } else if (key == 'r') { // TODO 초기화 깔끔하게 바꾸기
            game = Game()
        } else {
            println("invalid input detected: $key")
        }
    }
}
