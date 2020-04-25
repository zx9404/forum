/*
 Navicat Premium Data Transfer

 Source Server         : 腾讯云
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 49.234.234.73:3306
 Source Schema         : forum

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 25/04/2020 16:20:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_systemdictionary
-- ----------------------------
DROP TABLE IF EXISTS `t_systemdictionary`;
CREATE TABLE `t_systemdictionary`  (
  `dictionaryType` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典类型',
  `dictionaryValue` int(11) NULL DEFAULT NULL COMMENT '字典值',
  `dictionaryDescribe` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_systemparam
-- ----------------------------
DROP TABLE IF EXISTS `t_systemparam`;
CREATE TABLE `t_systemparam`  (
  `paramCode` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '参数代码',
  `paramValue` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参数取值',
  `paramDesc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参数描述',
  `paramPrepare` tinyint(4) NULL DEFAULT NULL COMMENT '参数是否需要开启预热:1|是;2|否',
  PRIMARY KEY (`paramCode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `userName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `lastLoginIp` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上次登录IP',
  `lastChangePassword` datetime(0) NULL DEFAULT NULL COMMENT '上次修改密码的时间',
  `sex` tinyint(4) NULL DEFAULT NULL COMMENT '性别:1|男;2|女',
  `telephone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `yx` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_xtdm
-- ----------------------------
DROP TABLE IF EXISTS `t_xtdm`;
CREATE TABLE `t_xtdm`  (
  `ibm` int(11) NULL DEFAULT NULL COMMENT '字典值',
  `note` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典内容',
  `cbm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
