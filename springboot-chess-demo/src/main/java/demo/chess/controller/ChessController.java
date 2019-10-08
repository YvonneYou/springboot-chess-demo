package demo.chess.controller;

import demo.chess.domain.ChessRequest;
import demo.chess.domain.ChessResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 下棋controller
 * 链接比赛定义的url是什么就改为什么，目前的链接是localhost:3000/api/***

 *
 */
@RestController
@RequestMapping(value = "/api")
public class ChessController {

    /**
     * 下棋
     * @param request
     * @return
     */
    @RequestMapping(value = "/sendPoint",method = RequestMethod.POST)
    @ResponseBody
    public ChessResponse doChess(@RequestBody ChessRequest request) {
        String boardId = request.getBoardId();
        // 转换成对应的x，y坐标
        Integer[][] board = request.getBoard();
        String[] record = request.getRecord();

        // 这里把对应的下棋源码放到chess的包目录下面改好后封装成方法，执行对应的下棋逻辑

        // 把结果封装成ChessResponse返回
        ChessResponse response = new ChessResponse();
        response.setChange(false);
        response.setGo("H9");
        return response;
    }
}
