package com.teamway.cms.pgutils;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.List;

public interface PG {

    /* 设置IP信息 */
    public static final int SET_IPINFO_REQ = 1011;
    public static final int SET_IPINFO_RES = 1012;

    /* 获取IP信息 */
    public static final int GET_IPINFO_REQ = 1013;
    public static final int GET_IPINFO_RES = 1014;

    /* 设置用户信息 */
    public static final int SET_USERINFO_REQ = 1021;
    public static final int SET_USERINFO_RES = 1022;

    /* 获取用户信息 */
    public static final int GET_USERINFO_REQ = 1023;
    public static final int GET_USERINFO_RES = 1024;

    /* 删除用户信息 */
    public static final int DEL_USERINFO_REQ = 1035;
    public static final int DEL_USERINFO_RES = 1036;

    /* 设置编码配置 */
    public static final int SET_ENCODE_CFG_REQ = 1041;
    public static final int SET_ENCODE_CFG_RES = 1042;

    /* 获取编码配置 */
    public static final int GET_ENCODE_CFG_REQ = 1043;
    public static final int GET_ENCODE_CFG_RES = 1044;

    /* 设置OSD信息 */
    public static final int SET_OSD_CFG_REQ = 1051;
    public static final int SET_OSD_CFG_RES = 1052;

    /* 获取OSD信息 */
    public static final int GET_OSD_CFG_REQ = 1053;
    public static final int GET_OSD_CFG_RES = 1054;

    /* 设置视频颜色参数*/
    public static final int SET_VIDEOCOLOR_REQ = 1061;
    public static final int SET_VIDEOCOLOR_RES = 1062;

    /* 获取视频颜色参数*/
    public static final int GET_VIDEOCOLOR_REQ = 1063;
    public static final int GET_VIDEOCOLOR_RES = 1064;

    /* 设置RPU系统配置 */
    public static final int SET_RPUSYS_CFG_REQ = 1065;
    public static final int SET_RPUSYS_CFG_RES = 1066;

    /* 获取RPU系统配置 */
    public static final int GET_RPUSYS_CFG_REQ = 1067;
    public static final int GET_RPUSYS_CFG_RES = 1068;

    /* 设置系统时间 */
    public static final int SET_TIME_REQ = 1071;
    public static final int SET_TIME_RES = 1072;

    /* 获取系统时间 */
    public static final int GET_TIME_REQ = 1073;
    public static final int GET_TIME_RES = 1074;

    /* 云台控制 包括预置位调用 */
    public static final int CTL_PTZ_REQ = 1097;
    public static final int CTL_PTZ_RES = 1098;

    /* 设置预置位 */
    public static final int SET_PTZPRESET_REQ = 1101;
    public static final int SET_PTZPRESET_RES = 1102;

    /* 获取预置位 */
    public static final int GET_PTZPRESET_REQ = 1103;
    public static final int GET_PTZPRESET_RES = 1104;

    /* 系统控制 */
    public static final int CTL_SYSTEM_REQ = 1127;
    public static final int CTL_SYSTEM_RES = 1128;

    /* 录像查询 */
    public static final int CTL_FINDFILE_REQ = 1141;
    public static final int CTL_FINDFILE_RES = 1142;

    /* 录像下载 */
    public static final int GET_FILE_REQ = 1143;
    public static final int GET_FILE_RES = 1144;

    /* 获取硬盘信息 */
    public static final int GET_DISKINFO_REQ = 1153;
    public static final int GET_DISKINFO_RES = 1154;

    /* 获取LOG信息 */
    public static final int GET_LOGINFO_REQ = 1163;
    public static final int GET_LOGINFO_RES = 1164;

    /* 设置管理配置 接入配置 */
    public static final int SET_CUTOVER_CFG_REQ = 1171;
    public static final int SET_CUTOVER_CFG_RES = 1172;

    /* 获取管理配置 接入配置 */
    public static final int GET_CUTOVER_CFG_REQ = 1173;
    public static final int GET_CUTOVER_CFG_RES = 1174;

    /* 设置串口信息 */
    public static final int SET_SERIAL_CFG_REQ = 1181;
    public static final int SET_SERIAL_CFG_RSP = 1182;

    /* 获取串口信息 */
    public static final int GET_SERIAL_CFG_REQ = 1183;
    public static final int GET_SERIAL_CFG_RSP = 1184;

    /* 串口控制信令传输 */
    public static final int TRANS_SERIAL_CMD_REQ = 1185;
    public static final int TRANS_SERIAL_CMD_RSP = 1186;

    /* 串口数据传输 */
    public static final int TRANS_SERIAL_DATA_REQ = 1187;
    public static final int TRANS_SERIAL_DATA_RSP = 1188;

    /* 告警配置和控制 */
    public static final int ALARMCTL_REQ = 1201;
    public static final int ALARMCTL_RES = 1202;

    /* 设置视频遮挡区域 */
    public static final int SET_VIDEO_HIDE_REGION_REQ = 1241;
    public static final int SET_VIDEO_HIDE_REGION_RSP = 1242;

    /* 获取视频遮挡区域 */
    public static final int GET_VIDEO_HIDE_REGION_REQ = 1243;
    public static final int GET_VIDEO_HIDE_REGION_RSP = 1244;

    /* 获取性能统计参数 */
    public static final int GET_RPU_PREFORMACE_REQ = 1253;
    public static final int GET_RPU_PREFORMACE_RSP = 1254;

    /* 设置布防状态 */
    public static final int SET_ALARMDEPLOY_REQ = 1261;
    public static final int SET_ALARMDEPLOY_RES = 1262;

    /* 获取布防状态 */
    public static final int GET_ALARMDEPLOY_REQ = 1263;
    public static final int GET_ALARMDEPLOY_RES = 1264;

    //add by xj 2012.5.11
    /*布撤防信息更改*/
    public static final int NOTIFY_ALMDEPLOY_REQ = 1361;
    public static final int NOTIFY_ALMDEPLOY_RSP = 1362;
    //end add

    /* 设置告警订阅 */
    public static final int SET_ALMSUBSCRIBE_REQ = 1265;
    public static final int SET_ALMSUBSCRIBE_RES = 1266;

    /* 获取告警订阅 */
    public static final int GET_ALMSUBSCRIBE_REQ = 1267;
    public static final int GET_ALMSUBSCRIBE_RES = 1268;

    //报警上传
    public static final int REPORT_ALARM_REQ = 1271;

    //设置RPU的告警配置
    public static final int SET_ALARM_CFG_REQ = 1273;
    public static final int SET_ALARM_CFG_RES = 1274;

    //获取RPU的告警配置
    public static final int GET_ALARM_CFG_REQ = 1275;
    public static final int GET_ALARM_CFG_RES = 1276;

    //环境上传
    public static final int REPORT_ENV = 1281;

    //设置RPU环境量配置
    public static final int SET_ENVDATA_CFG_REQ = 1283;
    public static final int SET_ENVDATA_CFG_RES = 1284;

    //获取RPU环境量配置
    public static final int GET_ENVDATA_CFG_REQ = 1285;
    public static final int GET_ENVDATA_CFG_RES = 1286;

    //RPU外部设备控制
    public static final int EXTERNAL_CTRL_REQ = 1293;
    public static final int EXTERNAL_CTRL_RES = 1294;
    public static final int CPTYPE_PTZHOME = 93;

    public static class CPTYPE_PTZHOME {
        int ptzid;
        int iPresetIndex; //守望位预置点序号
        int iHometime; //守望等待时间，单位秒
        int iHomeEnable; //守望使能标志，0-不启 动，1-启动

        public CPTYPE_PTZHOME(int ptzid, int iPresetIndex, int iHometime, int iHomeEnable) {
            this.ptzid = ptzid;
            this.iPresetIndex = iPresetIndex;
            this.iHometime = iHometime;
            this.iHomeEnable = iHomeEnable;
        }
    }

    //设置子设备id
    public static final int SET_SUBDEVID_REQ = 10001;
    public static final int SET_SUBDEVID_RES = 10002;

    //获取子设备id
    public static final int GET_SUBDEVID_REQ = 10003;
    public static final int GET_SUBDEVID_RES = 10004;

    //删除子设备
    public static final int MODIFY_SUBDEVID_REQ = 10005;
    public static final int MODIFY_SUBDEVID_RES = 10006;

    //刷新子设备
    public static final int FLUSH_SUBDEVID_REQ = 10007;
    public static final int FLUSH_SUBDEVID_RES = 10008;

    //模拟量数据查询
    public static final int GET_ANALOGDATA_REQ = 10101;
    public static final int GET_ANALOGDATA_RES = 10102;
    public static final int CPTYPE_INTVAL = 1;

    public class CPTYPE_INTVAL {
        int bianhao;
        int suoyinhao;

        public CPTYPE_INTVAL(int bianhao, int suoyinhao) {
            this.bianhao = bianhao;
            this.suoyinhao = suoyinhao;
        }
    }

    //设置传感器参数
    public static final int SET_ENVANALOGCFG_REQ = 10111;
    public static final int SET_ENVANALOGCFG_RES = 10112;

    //获取传感器参数
    public static final int GET_ENVANALOGCFG_REQ = 10113;
    public static final int GET_ENVANALOGCFG_RES = 10114;

    //设置门禁配置参数
    public static final int SET_DOORCTRLCFG_REQ = 10201;
    public static final int SET_DOORCTRLCFG_RES = 10202;

    //获取门禁配置参数
    public static final int GET_DOORCTRLCFG_REQ = 10203;
    public static final int GET_DOORCTRLCFG_RES = 10204;

    //控制门禁
    public static final int CTL_DOORCTRL_REQ = 10205;
    public static final int CTL_DOORCTRL_RES = 10206;

    /* 开始查看视频 */
    public static final int START_VIDEO_REQ = 2105;
    public static final int START_VIDEO_RES = 2106;

    public static final int VIDEO_DATA = 2107;

    /* 停止查看视频 */
    public static final int STOP_VIDEO_REQ = 2108;
    public static final int STOP_VIDEO_RES = 2109;

    /* 开始语音对讲 */
    public static final int START_TALK_REQ = 2203;
    public static final int START_TALK_RES = 2204;

    public static final int AUDIO_DATA = 2205;

    /* 停止语音对讲 */
    public static final int STOP_TALK_REQ = 2206;
    public static final int STOP_TALK_RES = 2207;

    /* 注册 */
    public static final int REGISTER_REQ = 3002;
    public static final int REGISTER_RES = 3003;

    /* 用户登录 */
    public static final int LOGIN_REQ = 3004;
    public static final int LOGIN_RES = 3005;

    /* 心跳 */
    public static final int HEARTBEAT_REQ = 3006;
    public static final int HEARTBEAT_RES = 3007;

    /* 请求获取环境量 */
    public static final int GET_ENVDATA_CFG_CF_REQ = 5001;
    public static final int GET_ENVDATA_CFG_CF_RES = 5002;

    /* 保存环境量 */
    public static final int SAVE_ENVDATA_REQ = 5003;
    public static final int SAVE_ENVDATA_RES = 5004;

    /* 读取环境量装置数据 */
    public static final int GET_ENVDEVICEDATA_REQ = 5005;
    public static final int GET_ENVDEVICEDATA_RES = 5006;

    public static final int CPCODE_PRIVATE_CODESTART = 10000;
    /*  通道名称osd显示和时间日期osd显示配置 */
    public static final int SET_MAINOSD_REQ = CPCODE_PRIVATE_CODESTART + 121;
    public static final int SET_MAINOSD_RES = CPCODE_PRIVATE_CODESTART + 122;
    public static final int GET_MAINOSD_REQ = CPCODE_PRIVATE_CODESTART + 123;
    public static final int GET_MAINOSD_RES = CPCODE_PRIVATE_CODESTART + 124;

    public static final int SET_PARKACTION_REQ = CPCODE_PRIVATE_CODESTART + 131;
    public static final int SET_PARKACTION_RES = CPCODE_PRIVATE_CODESTART + 132;
    public static final int GET_PARKACTION_REQ = CPCODE_PRIVATE_CODESTART + 133;
    public static final int GET_PARKACTION_RES = CPCODE_PRIVATE_CODESTART + 134;

    /* 获取在线设备状态 */
    public static final int GET_ONLINESTATE_REQ = CPCODE_PRIVATE_CODESTART + 141;
    public static final int GET_ONLINESTATE_RES = CPCODE_PRIVATE_CODESTART + 142;

    /////
    public static final int CPCODE_START_ALARM_INFO_REQ = 2130;
    public static final int CPCODE_START_ALARM_INFO_RSP = 2131;
    public static final int CPCODE_SEND_ALARMONLINE_INFO_REQ = 2132;

    public static final int CPCODE_SEND_ENV_INFO_REQ = 2133;
    public static final int CPCODE_SEND_ALARM_INFO_REQ = 2134;
    //////
    public static final int SEARCH_VOD_INFO_REQ = 20001;
    public static final int SEARCH_VOD_INFO_RSP = 20002;
    public static final int VOD_ELEMENT_INFO_REQ = 20003;
    public static final int START_VOD_PLAY = 20004;
    public static final int OPERATOR_VOD_PLAY_REQ = 20005;
    public static final int SEND_VOD_RULE_REQ = 20006;
    public static final int SEND_VOD_RULE_RSP = 20007;
    public static final int DELETE_VOD_RULE_REQ = 20008;
    public static final int DELETE_VOD_RULE_RSP = 20009;
    public static final int DELETE_ALL_VOD_RULE_REQ = 20010;
    public static final int DELETE_ALL_VOD_RULE_RSP = 20011;
    public static final int VOD_PLAY_FINI_REQ = 20012;

    public static final int CPCODE_START_VIDEO_REQ_PAG = 40770;        // 通过pag转发方式的视频请求
    public static final int CPCODE_START_VIDEO_RSP_PAG = 40771;        // 通过pag转发方式的视频请求响应
    public static final int CPCODE_STOP_VIDEO_REQ_PAG = 40772;        // 通过pag转发方式的停止视频请求
    public static final int CPCODE_STOP_VIDEO_RSP_PAG = 40773;        // 通过pag转发方式的停止视频请求响应
    public static final int CPCODE_CTL_PTZ_REQ_PAG = 40774;    // 通过pag转发方式的云台控制请求
    public static final int CPCODE_CTL_PTZ_RSP_PAG = 40775;        // 通过pag转发方式的云台控制请求响应

    public static final int PGHEADER_ERROR = 520;
    public static final int RPU_ERROR = 521;

    //last modify in 2012.4.12; add by xj
    /*网络流量信息上报*/
    public static final int REPORT_BANDWIDTH = 1301;

    /*站端设备在线率统计日报上报*/
    public static final int REPORT_ONLINES = 1302;

    /*视频主/辅码流请求*/
    public static final int STREAM_TYPE_REQ = 2111;
    public static final int STREAM_TYPE_RES = 2112;

    /*获取自动监测轨迹*/
    public static final int GET_MTRACE_CFG_REQ = 3118;
    public static final int GET_MTRACE_CFG_RSP = 3119;

    /*设置自动监测轨迹*/
    public static final int SET_MTRACE_CFG_REQ = 3120;
    public static final int SET_MTRACE_CFG_RSP = 3121;

    /*三维定焦*/
    public static final int SET_3DPTZCommand_REQ = 1095;
    public static final int SET_3DPTZCommand_RSP = 1096;

    /*PTZ预置点信息上报*/
    public static final int REPORT_PTZPRESET = 1105;

    //end

    public static final int CLI_PGCP_CPCODE_BUTT = 0;

    //last modify in 2012-08-27; add by xj
    /*设置导轨运行参数*/
    public static final int SET_SLIDERAIL_PARAM_REQ = 15001;
    public static final int SET_SLIDERAIL_PARAM_RSP = 15002;

    /*读取导轨运行速度*/
    public static final int GET_SLIDERAIL_PARAM_REQ = 15003;
    public static final int GET_SLIDERAIL_PARAM_RSP = 15004;


    //add by xj; 2014-02-11
    //设置子设备id
    public static final int SET_SUBDEVID_NEW_REQ = 16001;
    public static final int SET_SUBDEVID_NEW_RES = 16002;

    //删除子设备
    public static final int MODIFY_SUBDEVID_NEW_REQ = 16003;
    public static final int MODIFY_SUBDEVID_NEW_RES = 16004;

    public static final int DA_CODE_REQ = 4500;
    public static final int DA_CODE_RES = 4501;


    //Attr Type
    public static final int CPTYPE_INT = 1; // 4字节整形

    public class CPTYPE_INT {
        int iveidoid;

        public CPTYPE_INT() {
        }

        public CPTYPE_INT(int iveidoid) {
            this.iveidoid = iveidoid;
        }
    }

    public static final int CPTYPE_STRING = 2; // 以'\0'结尾字符串
    public static final int CPTYPE_IPINFO = 10;// IP 地址信息结构
    public static final int CPTYPE_USERINFO = 11;// 用户信息结构体
    public static final int CPTYPE_ENCODE = 12;  // 编码配置信息结构体
    public static final int CPTYPE_OSDCFG = 13;// OSD配置信息结构体

    public class CPTYPE_OSDCFG {
        int ivdei;
        int subnum;
        osd_info o;

        public CPTYPE_OSDCFG(int ivdei, int subnum, osd_info o) {
            this.ivdei = ivdei;
            this.subnum = subnum;
            this.o = o;
        }
    }

    public class osd_info {
        int videoid;
        int iosd;
        int iosdy;
        int iBgcolor; //背景色RGB(红，绿，蓝)
        int iAlpha; //背景透明度 0~256 默认128
        byte[] szOsd_text = new byte[128]; // 空表示无 OSD

        public osd_info(int videoid, int iosd, int iosdy, int iBgcolor, int iAlpha, byte[] szOsd_text) {
            this.videoid = videoid;
            this.iosd = iosd;
            this.iosdy = iosdy;
            this.iBgcolor = iBgcolor;
            System.arraycopy(szOsd_text, 0, this.szOsd_text, 0, szOsd_text.length);
        }
    }

    public static final int CCPTYPE_VIDEOCOLOR = 14; //
    public static final int CPTYPE_SYSTIME = 15;// 系统时间结构体

    public static class CPTYPE_SYSTIME {
        int iYear;
        int iMonth;
        int iDay;
        int iHour;
        int iMinute;
        int iSecond;

        public CPTYPE_SYSTIME(int iYear, int iMonth, int iDay, int iHour, int iMinute, int iSecond) {
            this.iYear = iYear;
            this.iMonth = iMonth;
            this.iDay = iDay;
            this.iHour = iHour;
            this.iMinute = iMinute;
            this.iSecond = iSecond;
        }
    }

    public static final int CPTYPE_PTZINFO = 16;//
    public static final int CPTYPE_CTLPTZ = 17;// 云台控制
    public static final int CPTYPE_PTZPRESET = 18;//
    public static final int CPTYPE_CDCTLPTZ = 19;//
    public static final int CPTYPE_STORAGEFILE = 20;//
    public static final int CPTYPE_DISKINFO = 21;//
    public static final int CPTYPE_LOGINFOSEARCH = 22;//

    public static class CPTYPE_LOGINFOSEARCH {
        int iSelectMode; // 0-全部，1-按类型，2-按时间，3-按时间和类型
        int iMajorType; // 0 表示所有类型
        int iMinorType; // 0 表示所有类型
        byte[] szLogTime = new byte[32];
        byte[] szLogData = new byte[32];

        public CPTYPE_LOGINFOSEARCH(int iSelectMode, int iMajorType, int iMinorType, byte[] szLogTime, byte[] szLogData) {
            this.iSelectMode = iSelectMode;
            this.iMajorType = iMajorType;
            this.iMinorType = iMinorType;
            System.arraycopy(szLogTime, 0, this.szLogTime, 0, szLogTime.length);
            System.arraycopy(szLogData, 0, this.szLogData, 0, szLogData.length);
        }
    }

    public static final int CPTYPE_LOGINFO = 23;//
    public static final int CPTYPE_MANAGECFG = 24;//

    public class CPTYPE_MANAGECFG {
        int iEnable;
        byte[] svrname = new byte[128];
        byte[] connpass = new byte[128]; // 注册时需要此信息
        byte[] szServerIpAddr = new byte[32];
        int iServerPort;

        public CPTYPE_MANAGECFG(int iEnable, byte[] svrname, byte[] connpass, byte[] szServerIpAddr, int iServerPort) {
            this.iEnable = iEnable;
            System.arraycopy(svrname, 0, this.svrname, 0, svrname.length);
            System.arraycopy(connpass, 0, this.connpass, 0, connpass.length);
            System.arraycopy(szServerIpAddr, 0, this.szServerIpAddr, 0, szServerIpAddr.length);
            this.iServerPort = iServerPort;
        }
    }

    public static final int CPTYPE_SEARIALPORT = 25;//
    public static final int CPTYPE_HIDEAREA = 31;//

    public class CPTYPE_HIDEAREA {
        int iVideoId;
        int iX;// 全部换算为(0,0)~(704,576)
        int iY;// 全部换算为 (0,0)~(704,576)
        int iWidth;// 全部换算为 (0,0)~(704,576)
        int iHeight;// 全部换算为 (0,0)~(704,576)

        public CPTYPE_HIDEAREA(int iVideoId, int iX, int iY, int iWidth, int iHeight) {
            this.iVideoId = iVideoId;
            this.iX = iX;
            this.iY = iY;
            this.iWidth = iWidth;
            this.iHeight = iHeight;
        }
    }

    public static final int CPTYPE_PERFORM = 32;//
    public static final int CPTYPE_ALARM = 33;//
    public static final int CPTYPE_AUDIODATA = 35;//音频信息结构体
    public static final int CPTYPE_AUDIOTRANCFG = 37;//音频传输配置结构体

    public class CPTYPE_AUDIOTRANCFG {
        int iAudiold;
        int iTalkType;
        int iTrankType;
        byte[] szDstIpAddr = new byte[32]; // IPC 发送的目标地址，客户端接收
        int iDstPort; // IPC 发送的端口
        byte[] szIPCIpAddr = new byte[32]; // 客户发送，IPC接收数据的地址，由 IPC 应答时填写
        int iIPCPort; // IPC 接收数据的端口
        int AudioCodec; // 音频编码，现在只支持g711a，值 1

        public CPTYPE_AUDIOTRANCFG(int iAudiold, int iTalkType, int iTrankType, byte[] szDstIpAddr, int iDstPort, byte[] szIPCIpAddr, int iIPCPort, int audioCodec) {
            this.iAudiold = iAudiold;
            this.iTalkType = iTalkType;
            this.iTrankType = iTrankType;
            System.arraycopy(szDstIpAddr, 0, this.szDstIpAddr, 0, szDstIpAddr.length);
            this.iDstPort = iDstPort;
            System.arraycopy(szIPCIpAddr, 0, this.szIPCIpAddr, 0, szIPCIpAddr.length);
            this.iIPCPort = iIPCPort;
            AudioCodec = audioCodec;
        }
    }

    public static final int CPTYPE_STREAMTYPE = 38;//码流类型
    public static final int SPTYPE_AUDIODATA = 34;//视频信息结构体

    public class SPTYPE_AUDIODATA {
        byte ucVideoType;
        byte ucFrameType;
        byte ucAckFlag;
        byte ucReserved;
        short usPacketNum;
        short usSeqNum;
        byte ucFramePerSec;
        byte ucIFreq;
        byte[] ucReserved_2 = new byte[2];
        byte ucVideoId;
        byte ucVideoFlag;
        short usDataLength;
        int uiDataBegin;
        int uiFrameID;
        int uiFrameLength;
        int uiTimeStamp;

        public SPTYPE_AUDIODATA(byte ucVideoType, byte ucFrameType, byte ucAckFlag, byte ucReserved, short usPacketNum, short usSeqNum, byte ucFramePerSec, byte ucIFreq, byte[] ucReserved_2, byte ucVideoId, byte ucVideoFlag, short usDataLength, int uiDataBegin, int uiFrameID, int uiFrameLength, int uiTimeStamp) {

            this.ucVideoType = ucVideoType;
            this.ucFrameType = ucFrameType;
            this.ucAckFlag = ucAckFlag;
            this.ucReserved = ucReserved;
            this.usPacketNum = usPacketNum;
            this.usSeqNum = usSeqNum;
            this.ucFramePerSec = ucFramePerSec;
            this.ucIFreq = ucIFreq;
            System.arraycopy(ucReserved_2, 0, this.ucReserved_2, 0, ucReserved_2.length);
            this.ucVideoId = ucVideoId;
            this.ucVideoFlag = ucVideoFlag;
            this.usDataLength = usDataLength;
            this.uiDataBegin = uiDataBegin;
            this.uiFrameID = uiFrameID;
            this.uiFrameLength = uiFrameLength;
            this.uiTimeStamp = uiTimeStamp;
        }
    }
    public class CPTYPE_STORAGEDATA {
        int id;
        int type;
        byte[] starttime = new byte[32];
        byte[] stoptime = new byte[32];
        byte[] filename = new byte[128];
        byte[] url = new byte[256];
        int icompression;

        public CPTYPE_STORAGEDATA(int id, int type, byte[] starttime, byte[] stoptime, byte[] filename, byte[] url, int icompression) {
            this.id = id;
            this.type = type;
            System.arraycopy(starttime, 0, this.starttime, 0, starttime.length);
            System.arraycopy(stoptime, 0, this.stoptime, 0, stoptime.length);
          //  System.arraycopy(filename, 0, this.filename, 0, filename.length);
            this.filename=filename;
            System.arraycopy(url, 0, this.url, 0, url.length);
            this.icompression = icompression;
        }
    }
    public static final int chaxunluxiang = 12;

    public class chaxunluxiang {
        int id;
        int type;
        byte[] starttime = new byte[32];
        byte[] stoptime = new byte[32];

        public chaxunluxiang(int id, int type, byte[] starttime, byte[] stoptime) {
            this.id = id;
            this.type = type;
            System.arraycopy(starttime, 0, this.starttime, 0, starttime.length);
            System.arraycopy(stoptime, 0, this.stoptime, 0, stoptime.length);
        }
    }

    public static final int SPTYPE_DATAACK = 39;//数据接收返回信息结构体

    public class SPTYPE_DATAACK {
        byte ucAckType;
        byte ucReserved;
        byte ucRecvPackets;
        byte ucDropPackets;
        byte ucVAID;
        byte ucVAFlag;
        byte[] ucReserved_2 = new byte[2];
        int uiFrameID;

        public SPTYPE_DATAACK(byte ucAckType, byte ucReserved, byte ucRecvPackets, byte ucDropPackets, byte ucVAID, byte ucVAFlag, byte[] ucReserved_2, int uiFrameID) {
            this.ucAckType = ucAckType;
            this.ucReserved = ucReserved;
            this.ucRecvPackets = ucRecvPackets;
            this.ucDropPackets = ucDropPackets;
            this.ucVAID = ucVAID;
            this.ucVAFlag = ucVAFlag;
            System.arraycopy(ucReserved_2, 0, this.ucReserved_2, 0, ucReserved_2.length);
            this.uiFrameID = uiFrameID;
        }
    }

    public static final int CPTYPE_MESSAGECODE = 54;// 反馈信息结构体
    public static final int CPTYPE_CTLSEARIALPORT = 60;//
    public static final int CPTYPE_SERIALPORTDATA = 61;//
    public static final int CPTYPE_STORAGESEARCH = 63;//
    public static final int CPTYPE_STORAGEDATA = 64;//
    public static final int CPTYPE_CTLALARM = 65;//
    public static final int CPTYPE_ALMDEPLO = 65;//

    public class CPTYPE_ALMDEPLO {
        long id;
        int type;
        int state;
        int camernum;
        int almnum;

        public CPTYPE_ALMDEPLO(long id, int type, int state, int camernum, int almnum) {
            this.id = id;
            this.type = type;
            this.state = state;
            this.camernum = camernum;
            this.almnum = almnum;
        }
    }

    public static final int CPTYPE_ALMDEPLOY = 66;//

    public class AlmInfo {
        long iSubAlmoutId;
        int iOutput; //报警输出0-输出 1-不输出

        public AlmInfo(long iSubAlmoutId, int iOutput) {
            this.iSubAlmoutId = iSubAlmoutId;
            this.iOutput = iOutput;
        }
    }

    public class CameraInfo {
        public CameraInfo(long iSubCameraId, int iPresetIndex, int iRecord) {
            this.iSubCameraId = iSubCameraId;
            this.iPresetIndex = iPresetIndex;
            this.iRecord = iRecord;
        }

        long iSubCameraId;
        int iPresetIndex;
        int iRecord; //是否录像 0-录像 1-不录像
    }

    public class CPTYPE_ALMDEPLOY {

        long iDevId; // 设备编号
        int iAlmType; //产生的告警类型
        int iAlmState; // 告警布撤防状态，0 撤防，1 布防
        int iCameraNum; //联动摄像机数量
        int iAlmOutNum;//联动报警输出设备数量
        CameraInfo cameraInfo;
        AlmInfo almInfo;

        public CPTYPE_ALMDEPLOY(long iDevId, int iAlmType, int iAlmState, int iCameraNum, int iAlmOutNum, CameraInfo cameraInfo, AlmInfo almInfo) {
            this.iDevId = iDevId;
            this.iAlmType = iAlmType;
            this.iAlmState = iAlmState;
            this.iCameraNum = iCameraNum;
            this.iAlmOutNum = iAlmOutNum;
            this.cameraInfo = cameraInfo;
            this.almInfo = almInfo;
        }
    }

    public class CPTYPE_ALMDEPLOYCOPY {
        long iDevId; // 设备编号
        int iAlmType; //产生的告警类型
        int iAlmState; // 告警布撤防状态，0 撤防，1 布防
        int iCameraNum; //联动摄像机数量
        int iAlmOutNum;//联动报警输出设备数量

        public CPTYPE_ALMDEPLOYCOPY(long iDevId, int iAlmType, int iAlmState, int iCameraNum, int iAlmOutNum) {
            this.iDevId = iDevId;
            this.iAlmType = iAlmType;
            this.iAlmState = iAlmState;
            this.iCameraNum = iCameraNum;
            this.iAlmOutNum = iAlmOutNum;
        }
    }

    public static final int CPTYPE_ALMSUBSCRIPTION = 67;//

    public class CPTYPE_ALMSUBSCRIPTION {
        int iDevType; // 设备类型
        int iDevName; // 设备名称
        int iDevId; // 设备编号
        int iAlmState; // 告警订阅状态，0 不订阅，1 订阅

        public CPTYPE_ALMSUBSCRIPTION(int iDevType, int iDevName, int iDevId, int iAlmState) {
            this.iDevType = iDevType;
            this.iDevName = iDevName;
            this.iDevId = iDevId;
            this.iAlmState = iAlmState;
        }
    }

    public static final int CPTYPE_ALM_INFO = 81;//
    public static final int CPTYPE_ALM_CFG = 82;//

    public class CPTYPE_ALM_CFG {
        int iDevType;
        int iDevName;
        int iDevId;
        byte[] iDevDesc = new byte[32];
        int iAlmType;
        int iDataLen;
        byte[] szdata = new byte[iDataLen];

        public CPTYPE_ALM_CFG(int iDevType, int iDevName, int iDevId, byte[] iDevDesc, int iAlmType, int iDataLen, byte[] szdata) {
            this.iDevType = iDevType;
            this.iDevName = iDevName;
            this.iDevId = iDevId;
            System.arraycopy(iDevDesc, 0, this.iDevDesc, 0, iDevDesc.length);
            this.iAlmType = iAlmType;
            this.iDataLen = iDataLen;
            System.arraycopy(szdata, 0, this.szdata, 0, szdata.length);
        }
    }

    public static final int CPTYPE_ENVDATA = 83;//

    public class CPTYPE_ENVDATA {
        int iDevType;
        int iDevName;
        int iDevId;
        int iDataLen;
        byte[] szData = new byte[iDataLen];

        public CPTYPE_ENVDATA(int iDevType, int iDevName, int iDevId, int iDataLen, byte[] szData) {
            this.iDevType = iDevType;
            this.iDevName = iDevName;
            this.iDevId = iDevId;
            this.iDataLen = iDataLen;
            System.arraycopy(szData, 0, this.szData, 0, szData.length);
        }
    }

    public static final int CPTYPE_ENVDATA_CFG = 84;//
    public static final int CPTYPE_EXTERNAL_CTRL = 85;//

    public class CPTYPE_EXTERNAL_CTRL {
        int iDevType;
        int iDevName;
        int iDevId;
        int iwaibu;
        int iDataLen;
        byte[] szData = new byte[iDataLen];

        public CPTYPE_EXTERNAL_CTRL(int iDevType, int iDevName, int iDevId, int iwaibu, int iDataLen, byte[] szData) {
            this.iDevType = iDevType;
            this.iDevName = iDevName;
            this.iDevId = iDevId;
            this.iwaibu = iwaibu;
            this.iDataLen = iDataLen;
            System.arraycopy(szData, 0, this.szData, 0, szData.length);
        }
    }

    public static final int CPTYPE_BANDWIDTH = 91;//
    public static final int CPTYPE_ONLINES = 92;//
    public static final int CPTYPE_DOORCTRL_DATA = 98;//
    public static final int CPTYPE_DOORCTRL_CFG = 99;//
    public static final int CPTYPE_RPUNAME = 101;// RPU名称信息结构体
    public  static  class  neibushebei{
        long iSubDevId; // 各个内部设备的具体编号，
        byte[] szSubDevDesc=new byte[32]; // 内部设备描

        public neibushebei(long iSubDevId, byte[] szSubDevDesc) {
            this.iSubDevId = iSubDevId;
            System.arraycopy(szSubDevDesc, 0, this.szSubDevDesc, 0, szSubDevDesc.length);
        }
    }
    public class CPTYPE_IPCNAME{
        byte[] szIPCName=new byte[128]; // 平台统一命名
        byte[] iIPCId=new byte[8]; // 平台统一编号
        int iIPCMajorType; // 主类型，当前为 1
        int iIPCMinorType; // 子类型，当前为 1
        byte[]szIPCModel=new byte[32]; // 只读，不可更改
        byte[]szIPCSerialId=new byte[64]; // 只读，不可更改
        byte[] szIPCVersion=new byte[64]; // 只读，不可更改
        int iSubDevIdNum; // 内部设备数量，
        neibushebei[]  shebiei=new neibushebei[iSubDevIdNum];

        public CPTYPE_IPCNAME(byte[] szIPCName, byte[] iIPCId, int iIPCMajorType, int iIPCMinorType, byte[] szIPCModel, byte[] szIPCSerialId, byte[] szIPCVersion, int iSubDevIdNum, neibushebei[] shebiei) {
            System.arraycopy(szIPCName, 0, this.szIPCName, 0, szIPCName.length);
            System.arraycopy(iIPCId, 0, this.iIPCId, 0, iIPCId.length);
            this.iIPCMajorType = iIPCMajorType;
            this.iIPCMinorType = iIPCMinorType;
            this.iSubDevIdNum = iSubDevIdNum;
            System.arraycopy(szIPCModel, 0, this.szIPCModel, 0, szIPCModel.length);
            System.arraycopy(szIPCSerialId, 0, this.szIPCSerialId, 0, szIPCSerialId.length);
            System.arraycopy(szIPCVersion, 0, this.szIPCVersion, 0, szIPCVersion.length);
            this.shebiei = shebiei;
        }
    }

    public static final int CPTYPE_SVCADDR = 102;// RPU 服务器地址

    public class CPTYPE_SVCADDR {
        byte[] szSvcIpAddr = new byte[32];
        short port;
        short usReserved;
        int iHeartBeatInterval;

        public CPTYPE_SVCADDR(byte[] szSvcIpAddr, short port, short usReserved, int iHeartBeatInterval) {
            System.arraycopy(szSvcIpAddr, 0, this.szSvcIpAddr, 0, szSvcIpAddr.length);
            this.port = port;
            this.usReserved = usReserved;
            this.iHeartBeatInterval = iHeartBeatInterval;
        }
    }

    public static final int CPTYPE_NTPSERVER = 107;//

    public static class CPTYPE_NTPSERVER {
        byte[] SZNTPADDR_1 = new byte[32];
        byte[] SZNTPADDR_2 = new byte[32];
        byte[] SZNTPADDR_3 = new byte[32];

        public CPTYPE_NTPSERVER(byte[] SZNTPADDR_1, byte[] SZNTPADDR_2, byte[] SZNTPADDR_3) {
            System.arraycopy(SZNTPADDR_1, 0, this.SZNTPADDR_1, 0, SZNTPADDR_1.length);
            System.arraycopy(SZNTPADDR_2, 0, this.SZNTPADDR_2, 0, SZNTPADDR_2.length);
            System.arraycopy(SZNTPADDR_3, 0, this.SZNTPADDR_3, 0, SZNTPADDR_3.length);

        }
    }

    public static final int CPTYPE_TIMEZONE = 108;//

    public static class CPTYPE_TIMEZONE {
        int timezone;
        byte[] szTimeZoneName = new byte[32];

        public CPTYPE_TIMEZONE(int timezone, byte[] szTimeZoneName) {
            this.timezone = timezone;
            System.arraycopy(szTimeZoneName, 0, this.szTimeZoneName, 0, szTimeZoneName.length);

        }
    }

    public static final int CPTYPE_REGRESULT = 109;//注册结果
    public static final int CPTYPE_SUBDEVID = 100;//
    public static final int CPTYPE_CONNPASS = 110;// 接入密码
    public static final int CPTYPE_MTRACE_ID = 111;//
    public static final int CPTYPE_MTRACE_CFG = 112;//
    public static final int CPTYPE_ALARMINFO_ENUM = 121;//
    public static final int CPTYPE_ENVINFO_ENUM = 122;//
    public static final int CPTYPE_CMSALARMINFO_ENUM = 123;//
    public static final int CPTYPE_CMSENVINFO_ENUM = 124;//
    public static final int CPTYPE_VODSEARCH_ENUM = 151;//
    public static final int CPTYPE_PAGEINFO_ENUM = 152;//
    public static final int CPTYPE_VODELEMENT_ENUM = 153;//
    public static final int CPTYPE_STARTVODINFO_ENUM = 154;//
    public static final int CPTYPE_VODRULE_ENUM = 155;//

    //=========================================================
    public class CPTYPE_ENCODE {
        int ivideoid;
        int icommpression;
        int iresolution;
        int ibitratecontrol;
        int iquality;
        int FPS;
        int bitrate;
        int igop;
        int iflag;

        public CPTYPE_ENCODE() {
        }

        public CPTYPE_ENCODE(int ivideoid, int icommpression, int iresolution, int ibitratecontrol, int iquality, int FPS, int bitrate, int igop, int iflag) {
            this.ivideoid = ivideoid;
            this.icommpression = icommpression;
            this.iresolution = iresolution;
            this.ibitratecontrol = ibitratecontrol;
            this.iquality = iquality;
            this.FPS = FPS;
            this.bitrate = bitrate;
            this.igop = igop;
            this.iflag = iflag;
        }
    }

    public class CPTYPE_IPINFO {
        int netCard;//网卡编号
        byte[] ipaddrees = new byte[32];
        byte[] dizhiyanma = new byte[32];
        byte[] dnsfuwuqi = new byte[128];
        byte[] wangguandizhi = new byte[32];

        public CPTYPE_IPINFO() {
        }

        public CPTYPE_IPINFO(int netCard, byte[] ipaddrees, byte[] dizhiyanma, byte[] dnsfuwuqi, byte[] wangguandizhi) {
            this.netCard = netCard;
            System.arraycopy(ipaddrees, 0, this.ipaddrees, 0, ipaddrees.length);
            System.arraycopy(dizhiyanma, 0, this.dizhiyanma, 0, dizhiyanma.length);
            System.arraycopy(dnsfuwuqi, 0, this.dnsfuwuqi, 0, dnsfuwuqi.length);
            System.arraycopy(wangguandizhi, 0, this.wangguandizhi, 0, wangguandizhi.length);

        }
    }


    public class CPTYPE_MESSAGECODE {

        public int iMessageCode;
        public int iMessageLen; // 反馈信息长度
        public byte[] szMessageString; // 反馈信息内容

        public CPTYPE_MESSAGECODE(int iMessageLen, int iMessageCode, byte[] szMessageString) {
            this.iMessageCode = iMessageCode;
            this.szMessageString = szMessageString;
            this.iMessageLen = szMessageString.length;
            System.arraycopy(szMessageString, 0, this.szMessageString, 0, szMessageString.length);
        }

        public CPTYPE_MESSAGECODE(int iMessageCode, byte[] szMessageString) {
            this.iMessageCode = iMessageCode;
            this.szMessageString = szMessageString;
            System.arraycopy(szMessageString, 0, this.szMessageString, 0, szMessageString.length);
        }
    }

    ;

    public class CPTYPE_REGRESULT {


        public int usRegResult;

        public CPTYPE_REGRESULT(int usRegResult) {
            this.usRegResult = usRegResult;
        }
    }

    ;


    public class CPTYPE_CTLPTZ {
        public int iPtzId;
        public int iPtzCmd;
        public int[] iParam = new int[4];


        public CPTYPE_CTLPTZ(int iPtzId, int iPtzCmd, int[] iParam) {
            this.iPtzId = iPtzId;
            this.iPtzCmd = iPtzCmd;
            System.arraycopy(iParam, 0, this.iParam, 0, iParam.length);
        }
    }

    ;


    public class CPTYPE_PRESET_SEARCH {
        public int iVideoId;
        public int iPresetIndex;

        public CPTYPE_PRESET_SEARCH(int iVideoId, int iPresetIndex) {
            this.iVideoId = iVideoId;
            this.iPresetIndex = iPresetIndex;
        }
    }

    ;
    //18

    public class CPTYPE_PTZPRESET {
        public CPTYPE_PTZPRESET() {
        }

        public int iPtzId;
        public int iPresetIndex;
        public byte[] szPresetName = new byte[128];

        public CPTYPE_PTZPRESET(int iPtzId, int iPresetIndex, byte[] szPresetName) {
            this.iPtzId = iPtzId;
            this.iPresetIndex = iPresetIndex;
            System.arraycopy(szPresetName, 0, this.szPresetName, 0, szPresetName.length);
        }
    }

    ;


    public class CPTYPE_USERINFOR {
        public byte[] szUserName = new byte[128];
        public byte[] szUserPass = new byte[128];
        public short iUserFlag; // 用户 flag，1-管理员 2-操作员
        public short iUserLevel; // 操作员级别 0  9 (逐级递减)

        public CPTYPE_USERINFOR(byte[] szUserName, byte[] szUserPass, short iUserFlag, short iUserLevel) {
            System.arraycopy(szUserName, 0, this.szUserName, 0, szUserName.length);
            System.arraycopy(szUserPass, 0, this.szUserPass, 0, szUserPass.length);
            this.iUserFlag = iUserFlag;
            this.iUserLevel = iUserLevel;
        }

    }

    ;

    public class CPTYPE_PERFORMANCE {
        public float fCPU; // CPU 使用率
        public float fMem; // 内存使用率
        public float fDisk; // 硬盘使用率
        public byte[] szTimeStamp = new byte[32]; // 时间戳


        public CPTYPE_PERFORMANCE() {

        }

        public CPTYPE_PERFORMANCE(float fCPU, float fMem, float fDisk, byte[] szTimeStamp) {

            this.fCPU = fCPU;
            this.fMem = fMem;
            this.fDisk = fDisk;
            System.arraycopy(szTimeStamp, 0, this.szTimeStamp, 0, szTimeStamp.length);
        }

    }

    ;


    public static class CPTYPE_STORAGEFILE_SEARCH {
        public int iVideoId;
        public int iFileType; // 文件类型，0全部，1普通
        public byte[] szStartTime = new byte[32];
        public byte[] szStopTime = new byte[32];

        public CPTYPE_STORAGEFILE_SEARCH() {
        }

        public CPTYPE_STORAGEFILE_SEARCH(int iVideoId, int iFileType, byte[] szStartTime, byte[] szStopTime) {
            this.iVideoId = iVideoId;
            this.iFileType = iFileType;
            System.arraycopy(szStartTime, 0, this.szStartTime, 0, szStartTime.length);
            System.arraycopy(szStopTime, 0, this.szStopTime, 0, szStopTime.length);
        }
    }

    ;

    public static class CPTYPE_STORAGEFILE {
        public int iVideoId; // 视频 ID，从 1 开始
        public int iFileType; // 0-全部，1-普通录像文件，2-报警录像文件，3-录音文件
        public int iSize;
        public byte[] szStartTime = new byte[32];
        public byte[] szStopTime = new byte[32];
        public byte[] szFileName = new byte[128];

        public CPTYPE_STORAGEFILE(int iVideoId, int iFileType, int iSize, byte[] szStartTime, byte[] szStopTime,
                                  byte[] szFileName) {

            this.iVideoId = iVideoId;
            this.iFileType = iFileType;
            this.iSize = iSize;

            System.arraycopy(szStartTime, 0, this.szStartTime, 0, szStartTime.length);
            System.arraycopy(szStopTime, 0, this.szStopTime, 0, szStopTime.length);
            System.arraycopy(szFileName, 0, this.szFileName, 0, szFileName.length);

        }

        public CPTYPE_STORAGEFILE() {

        }
    }

    ;

    public static class CPTYPE_STORAGEFILE_DATA {
        @Override
        public String toString() {
            return "CPTYPE_STORAGEFILE_DATA [iVideoId=" + iVideoId + ", iFileType=" + iFileType + ", szStartTime="
                    + Arrays.toString(szStartTime) + ", szStopTime=" + Arrays.toString(szStopTime) + ", szFileName="
                    + Arrays.toString(szFileName) + ", playURL=" + Arrays.toString(playURL) + ", iCompression="
                    + iCompression + "]";
        }

        public int iVideoId; // 视频 ID，从 1 开始
        public int iFileType; // 文件类型，0全部，1普通 录像文件，2 报警录像文件，3-录音文件
        public byte[] szStartTime = new byte[32];
        public byte[] szStopTime = new byte[32];
        public byte[] szFileName = new byte[128];
        public byte[] playURL = new byte[256];
        public int iCompression; // 16-录像文件支持 H264 	// 1-录音文件支持 G711a

        public CPTYPE_STORAGEFILE_DATA(int iVideoId, int iFileType, byte[] szStartTime, byte[] szStopTime,
                                       byte[] szFileName, byte[] playURL, int iCompression) {
            this.iVideoId = iVideoId;
            this.iFileType = iFileType;


            System.arraycopy(szStartTime, 0, this.szStartTime, 0, szStartTime.length);
            System.arraycopy(szStopTime, 0, this.szStopTime, 0, szStopTime.length);
            System.arraycopy(szFileName, 0, this.szFileName, 0, szFileName.length);
            System.arraycopy(playURL, 0, this.playURL, 0, playURL.length);

            this.iCompression = iCompression;
        }

        public CPTYPE_STORAGEFILE_DATA() {

        }

    }

    ;


    public class RPUCLI_RPUNAME {
        public byte[] szRpuName = new byte[128];        //RPU名称
        public long iRPUId;           //平台统一编号
        public int iRpuMajorType;
        public int iRpuMinorType;
        public byte[] szRpuMode = new byte[32];         //未知
        public byte[] szRpuSerial = new byte[64];       //序列号
        public byte[] szRpuVersion = new byte[64];      //版本号
        public int iSubDevIdNum;           //内部设备数量

        public RPUCLI_RPUNAME(byte[] szRpuName, long iRPUId, int iRpuMajorType, int iRpuMinorType, byte[] szRpuMode, byte[] szRpuSerial, byte[] szRpuVersion, int iSubDevIdNum) {
            this.iRPUId = iRPUId;
            this.iRpuMajorType = iRpuMajorType;
            this.iRpuMinorType = iRpuMinorType;
            System.arraycopy(szRpuName, 0, this.szRpuName, 0, szRpuName.length);
            System.arraycopy(szRpuMode, 0, this.szRpuMode, 0, szRpuMode.length);
            System.arraycopy(szRpuSerial, 0, this.szRpuSerial, 0, szRpuSerial.length);
            System.arraycopy(szRpuVersion, 0, this.szRpuVersion, 0, szRpuVersion.length);
            this.iSubDevIdNum = iSubDevIdNum;
        }
    }

    ;

    public class DEVINFO {
        public long iSubDevId;
        public byte[] szSubDevDesc = new byte[32];
    }

    public class RPUCLI_SVCADDR {
        public byte[] szSvcIpAddr = new byte[32];       //服务器地址
        public short nSvcPort;    //服务器端口
        public short nReserved;   //保留
        public int iHeartbeatInterval;     //心跳周期

        public RPUCLI_SVCADDR(byte[] szSvcIpAddr, short nSvcPort, short nReserved, int iHeartbeatInterval) {
            System.arraycopy(szSvcIpAddr, 0, this.szSvcIpAddr, 0, szSvcIpAddr.length);
            this.nSvcPort = nSvcPort;
            this.nReserved = nReserved;
            this.iHeartbeatInterval = iHeartbeatInterval;
        }
    }

    ;

    public class RPUCLI_CONNPASS {
        public byte[] szConnPass = new byte[128];  //密码
    }

    ;

    //IP地址信息
    public class RPUCLI_IPINFO {
        public int iNetId;
        public byte[] szIpAddress = new byte[32];
        public byte[] szSubNetMask = new byte[32];
        public byte[] szDns = new byte[128];
        public byte[] szGateWay = new byte[32];
    }

    ;

    public class RPUCLI_PERFORMANCE {
        public float fCPU;
        public float fMem;
        public float fDisk;
        public byte[] szTimeStamp = new byte[32];
    }

    ;
    public static final int CPTYPE_VIDEOTRANCFG = 36;

    public static class CPTYPE_VIDEOTRANCFG {
        public int iVideoId; // 视频 ID
        public int iVideoFlag; // 主辅码流
        public int iTranType; // 传输类型，1 表示 使用UDP 传输，2 表示使用 TCP
        public byte[] szDstIpAddr = new byte[32]; // RPU 发送的目标地址，可能是多播
        public int iDstPort; // RPU 发送的目标端口
        public int iVideoCodec; // 视频编码，现在只支持 H264，值 16

        public CPTYPE_VIDEOTRANCFG() {

        }

        public CPTYPE_VIDEOTRANCFG(int iVideoId, int iVideoFlag, int iTranType, byte[] szDstIpAddr, int iDstPort,
                                   int iVideoCodec) {
            this.iVideoId = iVideoId;
            this.iVideoFlag = iVideoFlag;
            this.iTranType = iTranType;
            System.arraycopy(szDstIpAddr, 0, this.szDstIpAddr, 0, szDstIpAddr.length);
            this.iDstPort = iDstPort;
            this.iVideoCodec = iVideoCodec;
        }
    }

    ;


    public class RPUCLI_VIDEODATA {
        public byte chVideoType;
        public byte chFrameType;
        public byte chAckFlag;
        public byte ucReserved;
        public short chPacketNum;
        public short chSeqNum;
        public byte chFramePerSec;
        public byte chIFreq;
        public byte ucReserved_2[] = new byte[2];
        public byte chVedioId;
        public byte chVideoFlag;
        public short nDataLength;
        public int nDataBegin;
        public int nFrameID;
        public int nFrameLength;
        public int nTimeStamp;
        public int nTimeStampExt;
        //byte[] * pVideoData;
    }

    ;

    public class RPUCLI_AUDIOTRANS {
        public int iAudioId;           // RPU音频设备，从1开始
        public int iTalkType;          // 通话类型，1：语音对讲，2：广播，3：录音
        public int iTranType;          // 传输方式，当前定义 1使用UDP传输
        public byte[] szDstIpAddr = new byte[32];   // RPU发送的目标地址，客户端接收
        public int iDstPort;           // RPU发送的端口
        public byte[] szRpuIpAddr = new byte[32];   // 客户发送，RPU接收数据的地址，由RPU应答时填写
        public int iRpuPort;           // RPU接收数据的端口
        public int AudioCodec;         // 音频编码，现在只支持g711a，值1
    }

    ;


    public class PTZ_HOME_INFO {
        public PTZ_HOME_INFO() {

        }

        public PTZ_HOME_INFO(int iPtzId, int iPresetIndex, int iHometime, int iHomeEnable) {

            this.iPtzId = iPtzId;
            this.iPresetIndex = iPresetIndex;
            this.iHometime = iHometime;
            this.iHomeEnable = iHomeEnable;
        }

        public int iPtzId;
        public int iPresetIndex;
        public int iHometime;
        public int iHomeEnable;
    }

    ;


    public class GET_PTZ_HOME_INFO {
        public GET_PTZ_HOME_INFO() {

        }

        public GET_PTZ_HOME_INFO(int iPtzId) {
            this.iPtzId = iPtzId;
        }

        public int iPtzId;

    }

    ;


}
