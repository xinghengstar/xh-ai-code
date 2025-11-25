package com.xh.xhaicode.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xh.xhaicode.model.dto.app.AppQueryRequest;
import com.xh.xhaicode.model.entity.App;
import com.xh.xhaicode.model.entity.User;
import com.xh.xhaicode.model.vo.AppVO;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 *  服务层。
 *
 * @author <a href="https://github.com/xinghengstar">星恒</a>
 */
public interface AppService extends IService<App> {

    /**
     * 通过对话生成应用代码
     * @param appId 应用ID
     * @param message 提示词
     * @param loginUser 用户
     * @return 流式返回
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    /**
     * 部署应用
     * @param appId 应用ID
     * @param loginUser 用户
     * @return 可访问的部署地址
     */
    String deployApp(Long appId, User loginUser);

    void generateAppScreenshotAsync(Long appId, String appUrl);

    /**
     * 获取应用封装类
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 构造应用查询条件
     * @param appQueryRequest 查询参数
     * @return 查询条件
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 获取vo列表
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

}
