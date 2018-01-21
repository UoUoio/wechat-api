package io.github.biezhi.wechat.api.enums;

/**
 * 消息类型
 * <p>
 * ALL: 所有消息
 * TEXT: 普通文本消息
 * IMAGE: 图片消息，type=3
 * EMOTICONS: 动画表情, type=47
 * VOICE: 音频消息
 * VIDEO: 视频消息
 * PERSON_CARD: 个人名片
 * REVOKE_MSG: 撤回消息
 * INVITE_FRIEND: 邀请好友（群组）
 * ADD_FRIEND: 添加好友请求
 * SHARE: 分享
 * CONTACT_INIT: 联系人初始化
 * UNKNOWN: 未知类型
 *
 * @author biezhi
 * @date 2018/1/19
 */
public enum MsgType {

    ALL, TEXT, IMAGE, EMOTICONS, VOICE, VIDEO, PERSON_CARD,
    INVITE_FRIEND, ADD_FRIEND, REVOKE_MSG, SHARE, CONTACT_INIT, UNKNOWN

}