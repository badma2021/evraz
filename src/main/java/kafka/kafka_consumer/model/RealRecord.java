//package kafka.kafka_consumer.model;
//
//import com.fasterxml.jackson.annotation.JsonAlias;
//import lombok.*;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//
//@Entity
//
//@Table(name = "real_record")
//public class RealRecord {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false, unique = true)
//    @ToString.Exclude
//    private Long id;
//
//    @JsonAlias({"moment"})
//    private String moment;
//    @JsonAlias({"SM_Exgauster\\[0:0]"})
//    private BigDecimal sensor1;
//    @JsonAlias({"SM_Exgauster\\[0:1]"})
//    private BigDecimal sensor2;
//    @JsonAlias({"SM_Exgauster\\[0:2]"})
//    private BigDecimal sensor3;
//    @JsonAlias({"SM_Exgauster\\[0:3]"})
//    private BigDecimal sensor4;
//    @JsonAlias({"SM_Exgauster\\[0:4]"})
//    private BigDecimal sensor5;
//    @JsonAlias({"SM_Exgauster\\[0:5]"})
//    private BigDecimal sensor6;
//    @JsonAlias({"SM_Exgauster\\[0:6]"})
//    private BigDecimal sensor7;
//    @JsonAlias({"SM_Exgauster\\[0:7]"})
//    private BigDecimal sensor8;
//    @JsonAlias({"SM_Exgauster\\[0:8]"})
//    private BigDecimal sensor9;
//    @JsonAlias({"SM_Exgauster\\[0:9]"})
//    private BigDecimal sensor10;
//    @JsonAlias({"SM_Exgauster\\[0:10]"})
//    private BigDecimal sensor11;
//    @JsonAlias({"SM_Exgauster\\[0:11]"})
//    private BigDecimal sensor12;
//    @JsonAlias({"SM_Exgauster\\[0:12]"})
//    private BigDecimal sensor13;
//    @JsonAlias({"SM_Exgauster\\[0:13]"})
//    private BigDecimal sensor14;
//    @JsonAlias({"SM_Exgauster\\[0:14]"})
//    private BigDecimal sensor15;
//    @JsonAlias({"SM_Exgauster\\[0:15]"})
//    private BigDecimal sensor16;
//    @JsonAlias({"SM_Exgauster\\[0:16]"})
//    private BigDecimal sensor17;
//    @JsonAlias({"SM_Exgauster\\[0:17]"})
//    private BigDecimal sensor18;
//    @JsonAlias({"SM_Exgauster\\[0:18]"})
//    private BigDecimal sensor19;
//    @JsonAlias({"SM_Exgauster\\[0:19]"})
//    private BigDecimal sensor20;
//    @JsonAlias({"SM_Exgauster\\[0:20]"})
//    private BigDecimal sensor21;
//    @JsonAlias({"SM_Exgauster\\[0:21]"})
//    private BigDecimal sensor22;
//    @JsonAlias({"SM_Exgauster\\[0:22]"})
//    private BigDecimal sensor23;
//    @JsonAlias({"SM_Exgauster\\[0:23]"})
//    private BigDecimal sensor24;
//    @JsonAlias({"SM_Exgauster\\[0:24]"})
//    private BigDecimal sensor25;
//    @JsonAlias({"SM_Exgauster\\[0:25]"})
//    private BigDecimal sensor26;
//    @JsonAlias({"SM_Exgauster\\[0:27]"})
//    private BigDecimal sensor27;
//    @JsonAlias({"SM_Exgauster\\[0:28]"})
//    private BigDecimal sensor28;
//    @JsonAlias({"SM_Exgauster\\[0:29]"})
//    private BigDecimal sensor29;
//    @JsonAlias({"SM_Exgauster\\[0:30]"})
//    private BigDecimal sensor30;
//    @JsonAlias({"SM_Exgauster\\[0:31]"})
//    private BigDecimal sensor31;
//    @JsonAlias({"SM_Exgauster\\[0:32]"})
//    private BigDecimal sensor32;
//    @JsonAlias({"SM_Exgauster\\[0:33]"})
//    private BigDecimal sensor33;
//    @JsonAlias({"SM_Exgauster\\[0:34]"})
//    private BigDecimal sensor34;
//    @JsonAlias({"SM_Exgauster\\[0:35]"})
//    private BigDecimal sensor35;
//    @JsonAlias({"SM_Exgauster\\[0:36]"})
//    private BigDecimal sensor36;
//    @JsonAlias({"SM_Exgauster\\[0:37]"})
//    private BigDecimal sensor37;
//    @JsonAlias({"SM_Exgauster\\[0:41]"})
//    private BigDecimal sensor38;
//    @JsonAlias({"SM_Exgauster\\[0:42]"})
//    private BigDecimal sensor39;
//    @JsonAlias({"SM_Exgauster\\[0:43]"})
//    private BigDecimal sensor40;
//    @JsonAlias({"SM_Exgauster\\[0:44]"})
//    private BigDecimal sensor41;
//    @JsonAlias({"SM_Exgauster\\[0:45]"})
//    private BigDecimal sensor42;
//    @JsonAlias({"SM_Exgauster\\[0:46]"})
//    private BigDecimal sensor43;
//    @JsonAlias({"SM_Exgauster\\[0:47]"})
//    private BigDecimal sensor44;
//    @JsonAlias({"SM_Exgauster\\[0:48]"})
//    private BigDecimal sensor45;
//    @JsonAlias({"SM_Exgauster\\[0:49]"})
//    private BigDecimal sensor46;
//    @JsonAlias({"SM_Exgauster\\[0:50]"})
//    private BigDecimal sensor47;
//    @JsonAlias({"SM_Exgauster\\[0:51]"})
//    private BigDecimal sensor48;
//    @JsonAlias({"SM_Exgauster\\[0:52]"})
//    private BigDecimal sensor49;
//    @JsonAlias({"SM_Exgauster\\[0:53]"})
//    private BigDecimal sensor50;
//    @JsonAlias({"SM_Exgauster\\[0:54]"})
//    private BigDecimal sensor51;
//    @JsonAlias({"SM_Exgauster\\[0:55]"})
//    private BigDecimal sensor52;
//    @JsonAlias({"SM_Exgauster\\[0:56]"})
//    private BigDecimal sensor53;
//    @JsonAlias({"SM_Exgauster\\[0:57]"})
//    private BigDecimal sensor54;
//    @JsonAlias({"SM_Exgauster\\[0:58]"})
//    private BigDecimal sensor55;
//    @JsonAlias({"SM_Exgauster\\[0:59]"})
//    private BigDecimal sensor56;
//    @JsonAlias({"SM_Exgauster\\[0:60]"})
//    private BigDecimal sensor57;
//    @JsonAlias({"SM_Exgauster\\[0:61]"})
//    private BigDecimal sensor58;
//    @JsonAlias({"SM_Exgauster\\[0:62]"})
//    private BigDecimal sensor59;
//    @JsonAlias({"SM_Exgauster\\[0:63]"})
//    private BigDecimal sensor60;
//    @JsonAlias({"SM_Exgauster\\[0:64]"})
//    private BigDecimal sensor61;
//    @JsonAlias({"SM_Exgauster\\[0:65]"})
//    private BigDecimal sensor62;
//    @JsonAlias({"SM_Exgauster\\[0:66]"})
//    private BigDecimal sensor63;
//    @JsonAlias({"SM_Exgauster\\[0:67]"})
//    private BigDecimal sensor64;
//    @JsonAlias({"SM_Exgauster\\[0:68]"})
//    private BigDecimal sensor65;
//    @JsonAlias({"SM_Exgauster\\[0:69]"})
//    private BigDecimal sensor66;
//    @JsonAlias({"SM_Exgauster\\[0:70]"})
//    private BigDecimal sensor67;
//    @JsonAlias({"SM_Exgauster\\[0:71]"})
//    private BigDecimal sensor68;
//    @JsonAlias({"SM_Exgauster\\[0:72]"})
//    private BigDecimal sensor69;
//    @JsonAlias({"SM_Exgauster\\[0:73]"})
//    private BigDecimal sensor70;
//    @JsonAlias({"SM_Exgauster\\[0:74]"})
//    private BigDecimal sensor71;
//    @JsonAlias({"SM_Exgauster\\[0:75]"})
//    private BigDecimal sensor72;
//    @JsonAlias({"SM_Exgauster\\[0:76]"})
//    private BigDecimal sensor73;
//    @JsonAlias({"SM_Exgauster\\[0:77]"})
//    private BigDecimal sensor74;
//    @JsonAlias({"SM_Exgauster\\[0:78]"})
//    private BigDecimal sensor75;
//    @JsonAlias({"SM_Exgauster\\[0:79]"})
//    private BigDecimal sensor76;
//    @JsonAlias({"SM_Exgauster\\[0:80]"})
//    private BigDecimal sensor77;
//    @JsonAlias({"SM_Exgauster\\[0:81]"})
//    private BigDecimal sensor78;
//    @JsonAlias({"SM_Exgauster\\[0:82]"})
//    private BigDecimal sensor79;
//    @JsonAlias({"SM_Exgauster\\[0:83]"})
//    private BigDecimal sensor80;
//    @JsonAlias({"SM_Exgauster\\[0:84]"})
//    private BigDecimal sensor81;
//    @JsonAlias({"SM_Exgauster\\[0:85]"})
//    private BigDecimal sensor82;
//    @JsonAlias({"SM_Exgauster\\[0:86]"})
//    private BigDecimal sensor83;
//    @JsonAlias({"SM_Exgauster\\[0:87]"})
//    private BigDecimal sensor84;
//    @JsonAlias({"SM_Exgauster\\[0:88]"})
//    private BigDecimal sensor85;
//    @JsonAlias({"SM_Exgauster\\[0:89]"})
//    private BigDecimal sensor86;
//    @JsonAlias({"SM_Exgauster\\[0:90]"})
//    private BigDecimal sensor87;
//    @JsonAlias({"SM_Exgauster\\[0:91]"})
//    private BigDecimal sensor88;
//    @JsonAlias({"SM_Exgauster\\[0:92]"})
//    private BigDecimal sensor89;
//    @JsonAlias({"SM_Exgauster\\[0:93]"})
//    private BigDecimal sensor90;
//    @JsonAlias({"SM_Exgauster\\[0:94]"})
//    private BigDecimal sensor91;
//    @JsonAlias({"SM_Exgauster\\[0:95]"})
//    private BigDecimal sensor92;
//    @JsonAlias({"SM_Exgauster\\[0:96]"})
//    private BigDecimal sensor93;
//    @JsonAlias({"SM_Exgauster\\[0:97]"})
//    private BigDecimal sensor94;
//    @JsonAlias({"SM_Exgauster\\[0:98]"})
//    private BigDecimal sensor95;
//    @JsonAlias({"SM_Exgauster\\[0:99]"})
//    private BigDecimal sensor96;
//    @JsonAlias({"SM_Exgauster\\[0:100]"})
//    private BigDecimal sensor97;
//    @JsonAlias({"SM_Exgauster\\[0:101]"})
//    private BigDecimal sensor98;
//    @JsonAlias({"SM_Exgauster\\[0:102]"})
//    private BigDecimal sensor99;
//    @JsonAlias({"SM_Exgauster\\[0:103]"})
//    private BigDecimal sensor100;
//    @JsonAlias({"SM_Exgauster\\[0:104]"})
//    private BigDecimal sensor101;
//    @JsonAlias({"SM_Exgauster\\[0:105]"})
//    private BigDecimal sensor102;
//    @JsonAlias({"SM_Exgauster\\[0:106]"})
//    private BigDecimal sensor103;
//    @JsonAlias({"SM_Exgauster\\[0:107]"})
//    private BigDecimal sensor104;
//    @JsonAlias({"SM_Exgauster\\[0:108]"})
//    private BigDecimal sensor105;
//    @JsonAlias({"SM_Exgauster\\[0:109]"})
//    private BigDecimal sensor106;
//    @JsonAlias({"SM_Exgauster\\[0:110]"})
//    private BigDecimal sensor107;
//    @JsonAlias({"SM_Exgauster\\[0:111]"})
//    private BigDecimal sensor108;
//    @JsonAlias({"SM_Exgauster\\[0:112]"})
//    private BigDecimal sensor109;
//    @JsonAlias({"SM_Exgauster\\[0:113]"})
//    private BigDecimal sensor110;
//    @JsonAlias({"SM_Exgauster\\[0:114]"})
//    private BigDecimal sensor111;
//    @JsonAlias({"SM_Exgauster\\[0:115]"})
//    private BigDecimal sensor112;
//    @JsonAlias({"SM_Exgauster\\[0:116]"})
//    private BigDecimal sensor113;
//    @JsonAlias({"SM_Exgauster\\[0:117]"})
//    private BigDecimal sensor114;
//    @JsonAlias({"SM_Exgauster\\[0:118]"})
//    private BigDecimal sensor115;
//    @JsonAlias({"SM_Exgauster\\[0:119]"})
//    private BigDecimal sensor116;
//    @JsonAlias({"SM_Exgauster\\[0:120]"})
//    private BigDecimal sensor117;
//    @JsonAlias({"SM_Exgauster\\[0:121]"})
//    private BigDecimal sensor118;
//    @JsonAlias({"SM_Exgauster\\[0:122]"})
//    private BigDecimal sensor119;
//    @JsonAlias({"SM_Exgauster\\[0:123]"})
//    private BigDecimal sensor120;
//    @JsonAlias({"SM_Exgauster\\[0:124]"})
//    private BigDecimal sensor121;
//    @JsonAlias({"SM_Exgauster\\[0:125]"})
//    private BigDecimal sensor122;
//    @JsonAlias({"SM_Exgauster\\[0:126]"})
//    private BigDecimal sensor123;
//    @JsonAlias({"SM_Exgauster\\[0:127]"})
//    private BigDecimal sensor124;
//    @JsonAlias({"SM_Exgauster\\[0:128]"})
//    private BigDecimal sensor125;
//    @JsonAlias({"SM_Exgauster\\[0:129]"})
//    private BigDecimal sensor126;
//    @JsonAlias({"SM_Exgauster\\[0:130]"})
//    private BigDecimal sensor127;
//    @JsonAlias({"SM_Exgauster\\[0:131]"})
//    private BigDecimal sensor128;
//    @JsonAlias({"SM_Exgauster\\[0:132]"})
//    private BigDecimal sensor129;
//    @JsonAlias({"SM_Exgauster\\[0:133]"})
//    private BigDecimal sensor130;
//    @JsonAlias({"SM_Exgauster\\[0:134]"})
//    private BigDecimal sensor131;
//    @JsonAlias({"SM_Exgauster\\[0:135]"})
//    private BigDecimal sensor132;
//    @JsonAlias({"SM_Exgauster\\[0:136]"})
//    private BigDecimal sensor133;
//    @JsonAlias({"SM_Exgauster\\[0:137]"})
//    private BigDecimal sensor134;
//    @JsonAlias({"SM_Exgauster\\[0:138]"})
//    private BigDecimal sensor135;
//    @JsonAlias({"SM_Exgauster\\[0:139]"})
//    private BigDecimal sensor136;
//    @JsonAlias({"SM_Exgauster\\[0:140]"})
//    private BigDecimal sensor137;
//    @JsonAlias({"SM_Exgauster\\[0:141]"})
//    private BigDecimal sensor138;
//    @JsonAlias({"SM_Exgauster\\[0:142]"})
//    private BigDecimal sensor139;
//    @JsonAlias({"SM_Exgauster\\[0:143]"})
//    private BigDecimal sensor140;
//    @JsonAlias({"SM_Exgauster\\[0:144]"})
//    private BigDecimal sensor141;
//    @JsonAlias({"SM_Exgauster\\[0:145]"})
//    private BigDecimal sensor142;
//    @JsonAlias({"SM_Exgauster\\[0:146]"})
//    private BigDecimal sensor143;
//    @JsonAlias({"SM_Exgauster\\[0:147]"})
//    private BigDecimal sensor144;
//    @JsonAlias({"SM_Exgauster\\[0:148]"})
//    private BigDecimal sensor145;
//    @JsonAlias({"SM_Exgauster\\[0:149]"})
//    private BigDecimal sensor146;
//    @JsonAlias({"SM_Exgauster\\[0:150]"})
//    private BigDecimal sensor147;
//    @JsonAlias({"SM_Exgauster\\[0:151]"})
//    private BigDecimal sensor148;
//    @JsonAlias({"SM_Exgauster\\[0:152]"})
//    private BigDecimal sensor149;
//    @JsonAlias({"SM_Exgauster\\[0:153]"})
//    private BigDecimal sensor150;
//    @JsonAlias({"SM_Exgauster\\[0:154]"})
//    private BigDecimal sensor151;
//    @JsonAlias({"SM_Exgauster\\[0:155]"})
//    private BigDecimal sensor152;
//    @JsonAlias({"SM_Exgauster\\[0:156]"})
//    private BigDecimal sensor153;
//    @JsonAlias({"SM_Exgauster\\[0:157]"})
//    private BigDecimal sensor154;
//    @JsonAlias({"SM_Exgauster\\[0:158]"})
//    private BigDecimal sensor155;
//    @JsonAlias({"SM_Exgauster\\[0:159]"})
//    private BigDecimal sensor156;
//    @JsonAlias({"SM_Exgauster\\[0:160]"})
//    private BigDecimal sensor157;
//    @JsonAlias({"SM_Exgauster\\[0:161]"})
//    private BigDecimal sensor158;
//    @JsonAlias({"SM_Exgauster\\[0:162]"})
//    private BigDecimal sensor159;
//    @JsonAlias({"SM_Exgauster\\[0:163]"})
//    private BigDecimal sensor160;
//    @JsonAlias({"SM_Exgauster\\[0:164]"})
//    private BigDecimal sensor161;
//    @JsonAlias({"SM_Exgauster\\[0:165]"})
//    private BigDecimal sensor162;
//    @JsonAlias({"SM_Exgauster\\[0:166]"})
//    private BigDecimal sensor163;
//    @JsonAlias({"SM_Exgauster\\[0:167]"})
//    private BigDecimal sensor164;
//    @JsonAlias({"SM_Exgauster\\[0:168]"})
//    private BigDecimal sensor165;
//    @JsonAlias({"SM_Exgauster\\[0:169]"})
//    private BigDecimal sensor166;
//    @JsonAlias({"SM_Exgauster\\[0:170]"})
//    private BigDecimal sensor167;
//    @JsonAlias({"SM_Exgauster\\[0:171]"})
//    private BigDecimal sensor168;
//    @JsonAlias({"SM_Exgauster\\[0:172]"})
//    private BigDecimal sensor169;
//    @JsonAlias({"SM_Exgauster\\[0:173]"})
//    private BigDecimal sensor170;
//    @JsonAlias({"SM_Exgauster\\[0:174]"})
//    private BigDecimal sensor171;
//    @JsonAlias({"SM_Exgauster\\[0:175]"})
//    private BigDecimal sensor172;
//    @JsonAlias({"SM_Exgauster\\[0:176]"})
//    private BigDecimal sensor173;
//    @JsonAlias({"SM_Exgauster\\[0:177]"})
//    private BigDecimal sensor174;
//    @JsonAlias({"SM_Exgauster\\[0:178]"})
//    private BigDecimal sensor175;
//    @JsonAlias({"SM_Exgauster\\[0:179]"})
//    private BigDecimal sensor176;
//    @JsonAlias({"SM_Exgauster\\[0:180]"})
//    private BigDecimal sensor177;
//    @JsonAlias({"SM_Exgauster\\[0:181]"})
//    private BigDecimal sensor178;
//    @JsonAlias({"SM_Exgauster\\[0:182]"})
//    private BigDecimal sensor179;
//    @JsonAlias({"SM_Exgauster\\[0:183]"})
//    private BigDecimal sensor180;
//    @JsonAlias({"SM_Exgauster\\[0:184]"})
//    private BigDecimal sensor181;
//    @JsonAlias({"SM_Exgauster\\[0:185]"})
//    private BigDecimal sensor182;
//    @JsonAlias({"SM_Exgauster\\[0:186]"})
//    private BigDecimal sensor183;
//    @JsonAlias({"SM_Exgauster\\[0:187]"})
//    private BigDecimal sensor184;
//    @JsonAlias({"SM_Exgauster\\[0:188]"})
//    private BigDecimal sensor185;
//    @JsonAlias({"SM_Exgauster\\[0:189]"})
//    private BigDecimal sensor186;
//    @JsonAlias({"SM_Exgauster\\[0:190]"})
//    private BigDecimal sensor187;
//    @JsonAlias({"SM_Exgauster\\[0:191]"})
//    private BigDecimal sensor188;
//    @JsonAlias({"SM_Exgauster\\[0:192]"})
//    private BigDecimal sensor189;
//    @JsonAlias({"SM_Exgauster\\[0:193]"})
//    private BigDecimal sensor190;
//    @JsonAlias({"SM_Exgauster\\[0:194]"})
//    private BigDecimal sensor191;
//    @JsonAlias({"SM_Exgauster\\[0:195]"})
//    private BigDecimal sensor192;
//    @JsonAlias({"SM_Exgauster\\[0:196]"})
//    private BigDecimal sensor193;
//    @JsonAlias({"SM_Exgauster\\[0:197]"})
//    private BigDecimal sensor194;
//    @JsonAlias({"SM_Exgauster\\[0:198]"})
//    private BigDecimal sensor195;
//    @JsonAlias({"SM_Exgauster\\[0:199]"})
//    private BigDecimal sensor196;
//    @JsonAlias({"SM_Exgauster\\[0:200]"})
//    private BigDecimal sensor197;
//    @JsonAlias({"SM_Exgauster\\[0:201]"})
//    private BigDecimal sensor198;
//    @JsonAlias({"SM_Exgauster\\[0:202]"})
//    private BigDecimal sensor199;
//    @JsonAlias({"SM_Exgauster\\[0:203]"})
//    private BigDecimal sensor200;
//    @JsonAlias({"SM_Exgauster\\[0:204]"})
//    private BigDecimal sensor201;
//    @JsonAlias({"SM_Exgauster\\[0:205]"})
//    private BigDecimal sensor202;
//    @JsonAlias({"SM_Exgauster\\[0:206]"})
//    private BigDecimal sensor203;
//    @JsonAlias({"SM_Exgauster\\[0:207]"})
//    private BigDecimal sensor204;
//    @JsonAlias({"SM_Exgauster\\[0:208]"})
//    private BigDecimal sensor205;
//    @JsonAlias({"SM_Exgauster\\[0:209]"})
//    private BigDecimal sensor206;
//    @JsonAlias({"SM_Exgauster\\[0:210]"})
//    private BigDecimal sensor207;
//    @JsonAlias({"SM_Exgauster\\[0:211]"})
//    private BigDecimal sensor208;
//    @JsonAlias({"SM_Exgauster\\[0:212]"})
//    private BigDecimal sensor209;
//    @JsonAlias({"SM_Exgauster\\[0:213]"})
//    private BigDecimal sensor210;
//    @JsonAlias({"SM_Exgauster\\[0:214]"})
//    private BigDecimal sensor211;
//    @JsonAlias({"SM_Exgauster\\[0:215]"})
//    private BigDecimal sensor212;
//    @JsonAlias({"SM_Exgauster\\[0:216]"})
//    private BigDecimal sensor213;
//    @JsonAlias({"SM_Exgauster\\[0:217]"})
//    private BigDecimal sensor214;
//    @JsonAlias({"SM_Exgauster\\[0:218]"})
//    private BigDecimal sensor215;
//    @JsonAlias({"SM_Exgauster\\[0:219]"})
//    private BigDecimal sensor216;
//    @JsonAlias({"SM_Exgauster\\[0:220]"})
//    private BigDecimal sensor217;
//    @JsonAlias({"SM_Exgauster\\[0:221]"})
//    private BigDecimal sensor218;
//    @JsonAlias({"SM_Exgauster\\[0:222]"})
//    private BigDecimal sensor219;
//    @JsonAlias({"SM_Exgauster\\[0:223]"})
//    private BigDecimal sensor220;
//    @JsonAlias({"SM_Exgauster\\[0:224]"})
//    private BigDecimal sensor221;
//    @JsonAlias({"SM_Exgauster\\[0:225]"})
//    private BigDecimal sensor222;
//    @JsonAlias({"SM_Exgauster\\[0:226]"})
//    private BigDecimal sensor223;
//    @JsonAlias({"SM_Exgauster\\[0:227]"})
//    private BigDecimal sensor224;
//    @JsonAlias({"SM_Exgauster\\[0:228]"})
//    private BigDecimal sensor225;
//    @JsonAlias({"SM_Exgauster\\[0:229]"})
//    private BigDecimal sensor226;
//    @JsonAlias({"SM_Exgauster\\[0:230]"})
//    private BigDecimal sensor227;
//    @JsonAlias({"SM_Exgauster\\[0.0]"})
//    private BigDecimal sensor228;
//    @JsonAlias({"SM_Exgauster\\[0.1]"})
//    private BigDecimal sensor229;
//    @JsonAlias({"SM_Exgauster\\[1:0]"})
//    private BigDecimal sensor230;
//    @JsonAlias({"SM_Exgauster\\[1:1]"})
//    private BigDecimal sensor231;
//    @JsonAlias({"SM_Exgauster\\[1:2]"})
//    private BigDecimal sensor232;
//    @JsonAlias({"SM_Exgauster\\[1:3]"})
//    private BigDecimal sensor233;
//    @JsonAlias({"SM_Exgauster\\[1:4]"})
//    private BigDecimal sensor234;
//    @JsonAlias({"SM_Exgauster\\[1:5]"})
//    private BigDecimal sensor235;
//    @JsonAlias({"SM_Exgauster\\[1:6]"})
//    private BigDecimal sensor236;
//    @JsonAlias({"SM_Exgauster\\[1:7]"})
//    private BigDecimal sensor237;
//    @JsonAlias({"SM_Exgauster\\[1:8]"})
//    private BigDecimal sensor238;
//    @JsonAlias({"SM_Exgauster\\[1:9]"})
//    private BigDecimal sensor239;
//    @JsonAlias({"SM_Exgauster\\[1:10]"})
//    private BigDecimal sensor240;
//    @JsonAlias({"SM_Exgauster\\[1:11]"})
//    private BigDecimal sensor241;
//    @JsonAlias({"SM_Exgauster\\[1:12]"})
//    private BigDecimal sensor242;
//    @JsonAlias({"SM_Exgauster\\[1:13]"})
//    private BigDecimal sensor243;
//    @JsonAlias({"SM_Exgauster\\[1.0]"})
//    private BigDecimal sensor244;
//    @JsonAlias({"SM_Exgauster\\[1.1]"})
//    private BigDecimal sensor245;
//    @JsonAlias({"SM_Exgauster\\[1.2]"})
//    private BigDecimal sensor246;
//    @JsonAlias({"SM_Exgauster\\[1.3]"})
//    private BigDecimal sensor247;
//    @JsonAlias({"SM_Exgauster\\[1.4]"})
//    private BigDecimal sensor248;
//    @JsonAlias({"SM_Exgauster\\[1.5]"})
//    private BigDecimal sensor249;
//    @JsonAlias({"SM_Exgauster\\[1.6]"})
//    private BigDecimal sensor250;
//    @JsonAlias({"SM_Exgauster\\[1.7]"})
//    private BigDecimal sensor251;
//    @JsonAlias({"SM_Exgauster\\[1.8]"})
//    private BigDecimal sensor252;
//    @JsonAlias({"SM_Exgauster\\[1.9]"})
//    private BigDecimal sensor253;
//    @JsonAlias({"SM_Exgauster\\[2:0]"})
//    private BigDecimal sensor254;
//    @JsonAlias({"SM_Exgauster\\[2:1]"})
//    private BigDecimal sensor255;
//    @JsonAlias({"SM_Exgauster\\[2:2]"})
//    private BigDecimal sensor256;
//    @JsonAlias({"SM_Exgauster\\[2:3]"})
//    private BigDecimal sensor257;
//    @JsonAlias({"SM_Exgauster\\[2:4]"})
//    private BigDecimal sensor258;
//    @JsonAlias({"SM_Exgauster\\[2:5]"})
//    private BigDecimal sensor259;
//    @JsonAlias({"SM_Exgauster\\[2:6]"})
//    private BigDecimal sensor260;
//    @JsonAlias({"SM_Exgauster\\[2:7]"})
//    private BigDecimal sensor261;
//    @JsonAlias({"SM_Exgauster\\[2:8]"})
//    private BigDecimal sensor262;
//    @JsonAlias({"SM_Exgauster\\[2:9]"})
//    private BigDecimal sensor263;
//    @JsonAlias({"SM_Exgauster\\[2:10]"})
//    private BigDecimal sensor264;
//    @JsonAlias({"SM_Exgauster\\[2:11]"})
//    private BigDecimal sensor265;
//    @JsonAlias({"SM_Exgauster\\[2:12]"})
//    private BigDecimal sensor266;
//    @JsonAlias({"SM_Exgauster\\[2:13]"})
//    private BigDecimal sensor267;
//    @JsonAlias({"SM_Exgauster\\[2:14]"})
//    private BigDecimal sensor268;
//    @JsonAlias({"SM_Exgauster\\[2:15]"})
//    private BigDecimal sensor269;
//    @JsonAlias({"SM_Exgauster\\[2:16]"})
//    private BigDecimal sensor270;
//    @JsonAlias({"SM_Exgauster\\[2:17]"})
//    private BigDecimal sensor271;
//    @JsonAlias({"SM_Exgauster\\[2:18]"})
//    private BigDecimal sensor272;
//    @JsonAlias({"SM_Exgauster\\[2:19]"})
//    private BigDecimal sensor273;
//    @JsonAlias({"SM_Exgauster\\[2:20]"})
//    private BigDecimal sensor274;
//    @JsonAlias({"SM_Exgauster\\[2:21]"})
//    private BigDecimal sensor275;
//    @JsonAlias({"SM_Exgauster\\[2:22]"})
//    private BigDecimal sensor276;
//    @JsonAlias({"SM_Exgauster\\[2:23]"})
//    private BigDecimal sensor277;
//    @JsonAlias({"SM_Exgauster\\[2:24]"})
//    private BigDecimal sensor278;
//    @JsonAlias({"SM_Exgauster\\[2:25]"})
//    private BigDecimal sensor279;
//    @JsonAlias({"SM_Exgauster\\[2:27]"})
//    private BigDecimal sensor280;
//    @JsonAlias({"SM_Exgauster\\[2:28]"})
//    private BigDecimal sensor281;
//    @JsonAlias({"SM_Exgauster\\[2:29]"})
//    private BigDecimal sensor282;
//    @JsonAlias({"SM_Exgauster\\[2:30]"})
//    private BigDecimal sensor283;
//    @JsonAlias({"SM_Exgauster\\[2:31]"})
//    private BigDecimal sensor284;
//    @JsonAlias({"SM_Exgauster\\[2:32]"})
//    private BigDecimal sensor285;
//    @JsonAlias({"SM_Exgauster\\[2:33]"})
//    private BigDecimal sensor286;
//    @JsonAlias({"SM_Exgauster\\[2:34]"})
//    private BigDecimal sensor287;
//    @JsonAlias({"SM_Exgauster\\[2:35]"})
//    private BigDecimal sensor288;
//    @JsonAlias({"SM_Exgauster\\[2:36]"})
//    private BigDecimal sensor289;
//    @JsonAlias({"SM_Exgauster\\[2:37]"})
//    private BigDecimal sensor290;
//    @JsonAlias({"SM_Exgauster\\[2:41]"})
//    private BigDecimal sensor291;
//    @JsonAlias({"SM_Exgauster\\[2:42]"})
//    private BigDecimal sensor292;
//    @JsonAlias({"SM_Exgauster\\[2:43]"})
//    private BigDecimal sensor293;
//    @JsonAlias({"SM_Exgauster\\[2:44]"})
//    private BigDecimal sensor294;
//    @JsonAlias({"SM_Exgauster\\[2:45]"})
//    private BigDecimal sensor295;
//    @JsonAlias({"SM_Exgauster\\[2:46]"})
//    private BigDecimal sensor296;
//    @JsonAlias({"SM_Exgauster\\[2:47]"})
//    private BigDecimal sensor297;
//    @JsonAlias({"SM_Exgauster\\[2:48]"})
//    private BigDecimal sensor298;
//    @JsonAlias({"SM_Exgauster\\[2:49]"})
//    private BigDecimal sensor299;
//    @JsonAlias({"SM_Exgauster\\[2:50]"})
//    private BigDecimal sensor300;
//    @JsonAlias({"SM_Exgauster\\[2:51]"})
//    private BigDecimal sensor301;
//    @JsonAlias({"SM_Exgauster\\[2:52]"})
//    private BigDecimal sensor302;
//    @JsonAlias({"SM_Exgauster\\[2:53]"})
//    private BigDecimal sensor303;
//    @JsonAlias({"SM_Exgauster\\[2:54]"})
//    private BigDecimal sensor304;
//    @JsonAlias({"SM_Exgauster\\[2:55]"})
//    private BigDecimal sensor305;
//    @JsonAlias({"SM_Exgauster\\[2:56]"})
//    private BigDecimal sensor306;
//    @JsonAlias({"SM_Exgauster\\[2:57]"})
//    private BigDecimal sensor307;
//    @JsonAlias({"SM_Exgauster\\[2:58]"})
//    private BigDecimal sensor308;
//    @JsonAlias({"SM_Exgauster\\[2:59]"})
//    private BigDecimal sensor309;
//    @JsonAlias({"SM_Exgauster\\[2:60]"})
//    private BigDecimal sensor310;
//    @JsonAlias({"SM_Exgauster\\[2:61]"})
//    private BigDecimal sensor311;
//    @JsonAlias({"SM_Exgauster\\[2:62]"})
//    private BigDecimal sensor312;
//    @JsonAlias({"SM_Exgauster\\[2:63]"})
//    private BigDecimal sensor313;
//    @JsonAlias({"SM_Exgauster\\[2:64]"})
//    private BigDecimal sensor314;
//    @JsonAlias({"SM_Exgauster\\[2:65]"})
//    private BigDecimal sensor315;
//    @JsonAlias({"SM_Exgauster\\[2:66]"})
//    private BigDecimal sensor316;
//    @JsonAlias({"SM_Exgauster\\[2:67]"})
//    private BigDecimal sensor317;
//    @JsonAlias({"SM_Exgauster\\[2:68]"})
//    private BigDecimal sensor318;
//    @JsonAlias({"SM_Exgauster\\[2:69]"})
//    private BigDecimal sensor319;
//    @JsonAlias({"SM_Exgauster\\[2:70]"})
//    private BigDecimal sensor320;
//    @JsonAlias({"SM_Exgauster\\[2:71]"})
//    private BigDecimal sensor321;
//    @JsonAlias({"SM_Exgauster\\[2:72]"})
//    private BigDecimal sensor322;
//    @JsonAlias({"SM_Exgauster\\[2:73]"})
//    private BigDecimal sensor323;
//    @JsonAlias({"SM_Exgauster\\[2:74]"})
//    private BigDecimal sensor324;
//    @JsonAlias({"SM_Exgauster\\[2:75]"})
//    private BigDecimal sensor325;
//    @JsonAlias({"SM_Exgauster\\[2:76]"})
//    private BigDecimal sensor326;
//    @JsonAlias({"SM_Exgauster\\[2:77]"})
//    private BigDecimal sensor327;
//    @JsonAlias({"SM_Exgauster\\[2:78]"})
//    private BigDecimal sensor328;
//    @JsonAlias({"SM_Exgauster\\[2:79]"})
//    private BigDecimal sensor329;
//    @JsonAlias({"SM_Exgauster\\[2:80]"})
//    private BigDecimal sensor330;
//    @JsonAlias({"SM_Exgauster\\[2:81]"})
//    private BigDecimal sensor331;
//    @JsonAlias({"SM_Exgauster\\[2:82]"})
//    private BigDecimal sensor332;
//    @JsonAlias({"SM_Exgauster\\[2:83]"})
//    private BigDecimal sensor333;
//    @JsonAlias({"SM_Exgauster\\[2:84]"})
//    private BigDecimal sensor334;
//    @JsonAlias({"SM_Exgauster\\[2:85]"})
//    private BigDecimal sensor335;
//    @JsonAlias({"SM_Exgauster\\[2:86]"})
//    private BigDecimal sensor336;
//    @JsonAlias({"SM_Exgauster\\[2:87]"})
//    private BigDecimal sensor337;
//    @JsonAlias({"SM_Exgauster\\[2:88]"})
//    private BigDecimal sensor338;
//    @JsonAlias({"SM_Exgauster\\[2:89]"})
//    private BigDecimal sensor339;
//    @JsonAlias({"SM_Exgauster\\[2:90]"})
//    private BigDecimal sensor340;
//    @JsonAlias({"SM_Exgauster\\[2:91]"})
//    private BigDecimal sensor341;
//    @JsonAlias({"SM_Exgauster\\[2:92]"})
//    private BigDecimal sensor342;
//    @JsonAlias({"SM_Exgauster\\[2:93]"})
//    private BigDecimal sensor343;
//    @JsonAlias({"SM_Exgauster\\[2:94]"})
//    private BigDecimal sensor344;
//    @JsonAlias({"SM_Exgauster\\[2:95]"})
//    private BigDecimal sensor345;
//    @JsonAlias({"SM_Exgauster\\[2:96]"})
//    private BigDecimal sensor346;
//    @JsonAlias({"SM_Exgauster\\[2:97]"})
//    private BigDecimal sensor347;
//    @JsonAlias({"SM_Exgauster\\[2:98]"})
//    private BigDecimal sensor348;
//    @JsonAlias({"SM_Exgauster\\[2:99]"})
//    private BigDecimal sensor349;
//    @JsonAlias({"SM_Exgauster\\[2:100]"})
//    private BigDecimal sensor350;
//    @JsonAlias({"SM_Exgauster\\[2:101]"})
//    private BigDecimal sensor351;
//    @JsonAlias({"SM_Exgauster\\[2:102]"})
//    private BigDecimal sensor352;
//    @JsonAlias({"SM_Exgauster\\[2:103]"})
//    private BigDecimal sensor353;
//    @JsonAlias({"SM_Exgauster\\[2:104]"})
//    private BigDecimal sensor354;
//    @JsonAlias({"SM_Exgauster\\[2:105]"})
//    private BigDecimal sensor355;
//    @JsonAlias({"SM_Exgauster\\[2:106]"})
//    private BigDecimal sensor356;
//    @JsonAlias({"SM_Exgauster\\[2:107]"})
//    private BigDecimal sensor357;
//    @JsonAlias({"SM_Exgauster\\[2:108]"})
//    private BigDecimal sensor358;
//    @JsonAlias({"SM_Exgauster\\[2:109]"})
//    private BigDecimal sensor359;
//    @JsonAlias({"SM_Exgauster\\[2:110]"})
//    private BigDecimal sensor360;
//    @JsonAlias({"SM_Exgauster\\[2:111]"})
//    private BigDecimal sensor361;
//    @JsonAlias({"SM_Exgauster\\[2:112]"})
//    private BigDecimal sensor362;
//    @JsonAlias({"SM_Exgauster\\[2:113]"})
//    private BigDecimal sensor363;
//    @JsonAlias({"SM_Exgauster\\[2:114]"})
//    private BigDecimal sensor364;
//    @JsonAlias({"SM_Exgauster\\[2:115]"})
//    private BigDecimal sensor365;
//    @JsonAlias({"SM_Exgauster\\[2:116]"})
//    private BigDecimal sensor366;
//    @JsonAlias({"SM_Exgauster\\[2:117]"})
//    private BigDecimal sensor367;
//    @JsonAlias({"SM_Exgauster\\[2:118]"})
//    private BigDecimal sensor368;
//    @JsonAlias({"SM_Exgauster\\[2:119]"})
//    private BigDecimal sensor369;
//    @JsonAlias({"SM_Exgauster\\[2:120]"})
//    private BigDecimal sensor370;
//    @JsonAlias({"SM_Exgauster\\[2:121]"})
//    private BigDecimal sensor371;
//    @JsonAlias({"SM_Exgauster\\[2:122]"})
//    private BigDecimal sensor372;
//    @JsonAlias({"SM_Exgauster\\[2:123]"})
//    private BigDecimal sensor373;
//    @JsonAlias({"SM_Exgauster\\[2:124]"})
//    private BigDecimal sensor374;
//    @JsonAlias({"SM_Exgauster\\[2:125]"})
//    private BigDecimal sensor375;
//    @JsonAlias({"SM_Exgauster\\[2:126]"})
//    private BigDecimal sensor376;
//    @JsonAlias({"SM_Exgauster\\[2:127]"})
//    private BigDecimal sensor377;
//    @JsonAlias({"SM_Exgauster\\[2:128]"})
//    private BigDecimal sensor378;
//    @JsonAlias({"SM_Exgauster\\[2:129]"})
//    private BigDecimal sensor379;
//    @JsonAlias({"SM_Exgauster\\[2:130]"})
//    private BigDecimal sensor380;
//    @JsonAlias({"SM_Exgauster\\[2:131]"})
//    private BigDecimal sensor381;
//    @JsonAlias({"SM_Exgauster\\[2:132]"})
//    private BigDecimal sensor382;
//    @JsonAlias({"SM_Exgauster\\[2:133]"})
//    private BigDecimal sensor383;
//    @JsonAlias({"SM_Exgauster\\[2:134]"})
//    private BigDecimal sensor384;
//    @JsonAlias({"SM_Exgauster\\[2:135]"})
//    private BigDecimal sensor385;
//    @JsonAlias({"SM_Exgauster\\[2:136]"})
//    private BigDecimal sensor386;
//    @JsonAlias({"SM_Exgauster\\[2:137]"})
//    private BigDecimal sensor387;
//    @JsonAlias({"SM_Exgauster\\[2:138]"})
//    private BigDecimal sensor388;
//    @JsonAlias({"SM_Exgauster\\[2:139]"})
//    private BigDecimal sensor389;
//    @JsonAlias({"SM_Exgauster\\[2:140]"})
//    private BigDecimal sensor390;
//    @JsonAlias({"SM_Exgauster\\[2:141]"})
//    private BigDecimal sensor391;
//    @JsonAlias({"SM_Exgauster\\[2:142]"})
//    private BigDecimal sensor392;
//    @JsonAlias({"SM_Exgauster\\[2:143]"})
//    private BigDecimal sensor393;
//    @JsonAlias({"SM_Exgauster\\[2:144]"})
//    private BigDecimal sensor394;
//    @JsonAlias({"SM_Exgauster\\[2:145]"})
//    private BigDecimal sensor395;
//    @JsonAlias({"SM_Exgauster\\[2:146]"})
//    private BigDecimal sensor396;
//    @JsonAlias({"SM_Exgauster\\[2:147]"})
//    private BigDecimal sensor397;
//    @JsonAlias({"SM_Exgauster\\[2:148]"})
//    private BigDecimal sensor398;
//    @JsonAlias({"SM_Exgauster\\[2:149]"})
//    private BigDecimal sensor399;
//    @JsonAlias({"SM_Exgauster\\[2:150]"})
//    private BigDecimal sensor400;
//    @JsonAlias({"SM_Exgauster\\[2:151]"})
//    private BigDecimal sensor401;
//    @JsonAlias({"SM_Exgauster\\[2:152]"})
//    private BigDecimal sensor402;
//    @JsonAlias({"SM_Exgauster\\[2:153]"})
//    private BigDecimal sensor403;
//    @JsonAlias({"SM_Exgauster\\[2:154]"})
//    private BigDecimal sensor404;
//    @JsonAlias({"SM_Exgauster\\[2:155]"})
//    private BigDecimal sensor405;
//    @JsonAlias({"SM_Exgauster\\[2:156]"})
//    private BigDecimal sensor406;
//    @JsonAlias({"SM_Exgauster\\[2:157]"})
//    private BigDecimal sensor407;
//    @JsonAlias({"SM_Exgauster\\[2:158]"})
//    private BigDecimal sensor408;
//    @JsonAlias({"SM_Exgauster\\[2:159]"})
//    private BigDecimal sensor409;
//    @JsonAlias({"SM_Exgauster\\[2:160]"})
//    private BigDecimal sensor410;
//    @JsonAlias({"SM_Exgauster\\[2:161]"})
//    private BigDecimal sensor411;
//    @JsonAlias({"SM_Exgauster\\[2:162]"})
//    private BigDecimal sensor412;
//    @JsonAlias({"SM_Exgauster\\[2:163]"})
//    private BigDecimal sensor413;
//    @JsonAlias({"SM_Exgauster\\[2:164]"})
//    private BigDecimal sensor414;
//    @JsonAlias({"SM_Exgauster\\[2:165]"})
//    private BigDecimal sensor415;
//    @JsonAlias({"SM_Exgauster\\[2:166]"})
//    private BigDecimal sensor416;
//    @JsonAlias({"SM_Exgauster\\[2:167]"})
//    private BigDecimal sensor417;
//    @JsonAlias({"SM_Exgauster\\[2:168]"})
//    private BigDecimal sensor418;
//    @JsonAlias({"SM_Exgauster\\[2:169]"})
//    private BigDecimal sensor419;
//    @JsonAlias({"SM_Exgauster\\[2:170]"})
//    private BigDecimal sensor420;
//    @JsonAlias({"SM_Exgauster\\[2:171]"})
//    private BigDecimal sensor421;
//    @JsonAlias({"SM_Exgauster\\[2:172]"})
//    private BigDecimal sensor422;
//    @JsonAlias({"SM_Exgauster\\[2:173]"})
//    private BigDecimal sensor423;
//    @JsonAlias({"SM_Exgauster\\[2:174]"})
//    private BigDecimal sensor424;
//    @JsonAlias({"SM_Exgauster\\[2:175]"})
//    private BigDecimal sensor425;
//    @JsonAlias({"SM_Exgauster\\[2:176]"})
//    private BigDecimal sensor426;
//    @JsonAlias({"SM_Exgauster\\[2:177]"})
//    private BigDecimal sensor427;
//    @JsonAlias({"SM_Exgauster\\[2:178]"})
//    private BigDecimal sensor428;
//    @JsonAlias({"SM_Exgauster\\[2:179]"})
//    private BigDecimal sensor429;
//    @JsonAlias({"SM_Exgauster\\[2:180]"})
//    private BigDecimal sensor430;
//    @JsonAlias({"SM_Exgauster\\[2:181]"})
//    private BigDecimal sensor431;
//    @JsonAlias({"SM_Exgauster\\[2:182]"})
//    private BigDecimal sensor432;
//    @JsonAlias({"SM_Exgauster\\[2:183]"})
//    private BigDecimal sensor433;
//    @JsonAlias({"SM_Exgauster\\[2:184]"})
//    private BigDecimal sensor434;
//    @JsonAlias({"SM_Exgauster\\[2:185]"})
//    private BigDecimal sensor435;
//    @JsonAlias({"SM_Exgauster\\[2:186]"})
//    private BigDecimal sensor436;
//    @JsonAlias({"SM_Exgauster\\[2:187]"})
//    private BigDecimal sensor437;
//    @JsonAlias({"SM_Exgauster\\[2:188]"})
//    private BigDecimal sensor438;
//    @JsonAlias({"SM_Exgauster\\[2:189]"})
//    private BigDecimal sensor439;
//    @JsonAlias({"SM_Exgauster\\[2:190]"})
//    private BigDecimal sensor440;
//    @JsonAlias({"SM_Exgauster\\[2:191]"})
//    private BigDecimal sensor441;
//    @JsonAlias({"SM_Exgauster\\[2:192]"})
//    private BigDecimal sensor442;
//    @JsonAlias({"SM_Exgauster\\[2:193]"})
//    private BigDecimal sensor443;
//    @JsonAlias({"SM_Exgauster\\[2:194]"})
//    private BigDecimal sensor444;
//    @JsonAlias({"SM_Exgauster\\[2:195]"})
//    private BigDecimal sensor445;
//    @JsonAlias({"SM_Exgauster\\[2:196]"})
//    private BigDecimal sensor446;
//    @JsonAlias({"SM_Exgauster\\[2:197]"})
//    private BigDecimal sensor447;
//    @JsonAlias({"SM_Exgauster\\[2:198]"})
//    private BigDecimal sensor448;
//    @JsonAlias({"SM_Exgauster\\[2:199]"})
//    private BigDecimal sensor449;
//    @JsonAlias({"SM_Exgauster\\[2:200]"})
//    private BigDecimal sensor450;
//    @JsonAlias({"SM_Exgauster\\[2:201]"})
//    private BigDecimal sensor451;
//    @JsonAlias({"SM_Exgauster\\[2:202]"})
//    private BigDecimal sensor452;
//    @JsonAlias({"SM_Exgauster\\[2:203]"})
//    private BigDecimal sensor453;
//    @JsonAlias({"SM_Exgauster\\[2:204]"})
//    private BigDecimal sensor454;
//    @JsonAlias({"SM_Exgauster\\[2:205]"})
//    private BigDecimal sensor455;
//    @JsonAlias({"SM_Exgauster\\[2:206]"})
//    private BigDecimal sensor456;
//    @JsonAlias({"SM_Exgauster\\[2:207]"})
//    private BigDecimal sensor457;
//    @JsonAlias({"SM_Exgauster\\[2:208]"})
//    private BigDecimal sensor458;
//    @JsonAlias({"SM_Exgauster\\[2:209]"})
//    private BigDecimal sensor459;
//    @JsonAlias({"SM_Exgauster\\[2:210]"})
//    private BigDecimal sensor460;
//    @JsonAlias({"SM_Exgauster\\[2:211]"})
//    private BigDecimal sensor461;
//    @JsonAlias({"SM_Exgauster\\[2:212]"})
//    private BigDecimal sensor462;
//    @JsonAlias({"SM_Exgauster\\[2:213]"})
//    private BigDecimal sensor463;
//    @JsonAlias({"SM_Exgauster\\[2:214]"})
//    private BigDecimal sensor464;
//    @JsonAlias({"SM_Exgauster\\[2:215]"})
//    private BigDecimal sensor465;
//    @JsonAlias({"SM_Exgauster\\[2:216]"})
//    private BigDecimal sensor466;
//    @JsonAlias({"SM_Exgauster\\[2:217]"})
//    private BigDecimal sensor467;
//    @JsonAlias({"SM_Exgauster\\[2:218]"})
//    private BigDecimal sensor468;
//    @JsonAlias({"SM_Exgauster\\[2:219]"})
//    private BigDecimal sensor469;
//    @JsonAlias({"SM_Exgauster\\[2:220]"})
//    private BigDecimal sensor470;
//    @JsonAlias({"SM_Exgauster\\[2:221]"})
//    private BigDecimal sensor471;
//    @JsonAlias({"SM_Exgauster\\[2:222]"})
//    private BigDecimal sensor472;
//    @JsonAlias({"SM_Exgauster\\[2:223]"})
//    private BigDecimal sensor473;
//    @JsonAlias({"SM_Exgauster\\[2:224]"})
//    private BigDecimal sensor474;
//    @JsonAlias({"SM_Exgauster\\[2:225]"})
//    private BigDecimal sensor475;
//    @JsonAlias({"SM_Exgauster\\[2:226]"})
//    private BigDecimal sensor476;
//    @JsonAlias({"SM_Exgauster\\[2:227]"})
//    private BigDecimal sensor477;
//    @JsonAlias({"SM_Exgauster\\[2:228]"})
//    private BigDecimal sensor478;
//    @JsonAlias({"SM_Exgauster\\[2:229]"})
//    private BigDecimal sensor479;
//    @JsonAlias({"SM_Exgauster\\[2:230]"})
//    private BigDecimal sensor480;
//    @JsonAlias({"SM_Exgauster\\[2:231]"})
//    private BigDecimal sensor481;
//    @JsonAlias({"SM_Exgauster\\[2:232]"})
//    private BigDecimal sensor482;
//    @JsonAlias({"SM_Exgauster\\[2.0]"})
//    private BigDecimal sensor483;
//    @JsonAlias({"SM_Exgauster\\[2.1]"})
//    private BigDecimal sensor484;
//    @JsonAlias({"SM_Exgauster\\[3:0]"})
//    private BigDecimal sensor485;
//    @JsonAlias({"SM_Exgauster\\[3:1]"})
//    private BigDecimal sensor486;
//    @JsonAlias({"SM_Exgauster\\[3:2]"})
//    private BigDecimal sensor487;
//    @JsonAlias({"SM_Exgauster\\[3:3]"})
//    private BigDecimal sensor488;
//    @JsonAlias({"SM_Exgauster\\[3:4]"})
//    private BigDecimal sensor489;
//    @JsonAlias({"SM_Exgauster\\[3:5]"})
//    private BigDecimal sensor490;
//    @JsonAlias({"SM_Exgauster\\[3:6]"})
//    private BigDecimal sensor491;
//    @JsonAlias({"SM_Exgauster\\[3:7]"})
//    private BigDecimal sensor492;
//    @JsonAlias({"SM_Exgauster\\[3:8]"})
//    private BigDecimal sensor493;
//    @JsonAlias({"SM_Exgauster\\[3:9]"})
//    private BigDecimal sensor494;
//    @JsonAlias({"SM_Exgauster\\[3:10]"})
//    private BigDecimal sensor495;
//    @JsonAlias({"SM_Exgauster\\[3:11]"})
//    private BigDecimal sensor496;
//    @JsonAlias({"SM_Exgauster\\[3:12]"})
//    private BigDecimal sensor497;
//    @JsonAlias({"SM_Exgauster\\[3:13]"})
//    private BigDecimal sensor498;
//    @JsonAlias({"SM_Exgauster\\[3:14]"})
//    private BigDecimal sensor499;
//    @JsonAlias({"SM_Exgauster\\[3:15]"})
//    private BigDecimal sensor500;
//    @JsonAlias({"SM_Exgauster\\[3:16]"})
//    private BigDecimal sensor501;
//    @JsonAlias({"SM_Exgauster\\[3:17]"})
//    private BigDecimal sensor502;
//    @JsonAlias({"SM_Exgauster\\[3:18]"})
//    private BigDecimal sensor503;
//    @JsonAlias({"SM_Exgauster\\[3:19]"})
//    private BigDecimal sensor504;
//    @JsonAlias({"SM_Exgauster\\[3:20]"})
//    private BigDecimal sensor505;
//    @JsonAlias({"SM_Exgauster\\[3:21]"})
//    private BigDecimal sensor506;
//    @JsonAlias({"SM_Exgauster\\[3:22]"})
//    private BigDecimal sensor507;
//    @JsonAlias({"SM_Exgauster\\[3:23]"})
//    private BigDecimal sensor508;
//    @JsonAlias({"SM_Exgauster\\[3:24]"})
//    private BigDecimal sensor509;
//    @JsonAlias({"SM_Exgauster\\[3:25]"})
//    private BigDecimal sensor510;
//    @JsonAlias({"SM_Exgauster\\[3:27]"})
//    private BigDecimal sensor511;
//    @JsonAlias({"SM_Exgauster\\[3:28]"})
//    private BigDecimal sensor512;
//    @JsonAlias({"SM_Exgauster\\[3:29]"})
//    private BigDecimal sensor513;
//    @JsonAlias({"SM_Exgauster\\[3:30]"})
//    private BigDecimal sensor514;
//    @JsonAlias({"SM_Exgauster\\[3:31]"})
//    private BigDecimal sensor515;
//    @JsonAlias({"SM_Exgauster\\[3:32]"})
//    private BigDecimal sensor516;
//    @JsonAlias({"SM_Exgauster\\[3:33]"})
//    private BigDecimal sensor517;
//    @JsonAlias({"SM_Exgauster\\[3:34]"})
//    private BigDecimal sensor518;
//    @JsonAlias({"SM_Exgauster\\[3:35]"})
//    private BigDecimal sensor519;
//    @JsonAlias({"SM_Exgauster\\[3:36]"})
//    private BigDecimal sensor520;
//    @JsonAlias({"SM_Exgauster\\[3:37]"})
//    private BigDecimal sensor521;
//    @JsonAlias({"SM_Exgauster\\[3:41]"})
//    private BigDecimal sensor522;
//    @JsonAlias({"SM_Exgauster\\[3:42]"})
//    private BigDecimal sensor523;
//    @JsonAlias({"SM_Exgauster\\[3:43]"})
//    private BigDecimal sensor524;
//    @JsonAlias({"SM_Exgauster\\[3:44]"})
//    private BigDecimal sensor525;
//    @JsonAlias({"SM_Exgauster\\[3:45]"})
//    private BigDecimal sensor526;
//    @JsonAlias({"SM_Exgauster\\[3:46]"})
//    private BigDecimal sensor527;
//    @JsonAlias({"SM_Exgauster\\[3:47]"})
//    private BigDecimal sensor528;
//    @JsonAlias({"SM_Exgauster\\[3:48]"})
//    private BigDecimal sensor529;
//    @JsonAlias({"SM_Exgauster\\[3:49]"})
//    private BigDecimal sensor530;
//    @JsonAlias({"SM_Exgauster\\[3:50]"})
//    private BigDecimal sensor531;
//    @JsonAlias({"SM_Exgauster\\[3:51]"})
//    private BigDecimal sensor532;
//    @JsonAlias({"SM_Exgauster\\[3:52]"})
//    private BigDecimal sensor533;
//    @JsonAlias({"SM_Exgauster\\[3:53]"})
//    private BigDecimal sensor534;
//    @JsonAlias({"SM_Exgauster\\[3:54]"})
//    private BigDecimal sensor535;
//    @JsonAlias({"SM_Exgauster\\[3:55]"})
//    private BigDecimal sensor536;
//    @JsonAlias({"SM_Exgauster\\[3:56]"})
//    private BigDecimal sensor537;
//    @JsonAlias({"SM_Exgauster\\[3:57]"})
//    private BigDecimal sensor538;
//    @JsonAlias({"SM_Exgauster\\[3:58]"})
//    private BigDecimal sensor539;
//    @JsonAlias({"SM_Exgauster\\[3:59]"})
//    private BigDecimal sensor540;
//    @JsonAlias({"SM_Exgauster\\[3:60]"})
//    private BigDecimal sensor541;
//    @JsonAlias({"SM_Exgauster\\[3:61]"})
//    private BigDecimal sensor542;
//    @JsonAlias({"SM_Exgauster\\[3:62]"})
//    private BigDecimal sensor543;
//    @JsonAlias({"SM_Exgauster\\[3:63]"})
//    private BigDecimal sensor544;
//    @JsonAlias({"SM_Exgauster\\[3:64]"})
//    private BigDecimal sensor545;
//    @JsonAlias({"SM_Exgauster\\[3:65]"})
//    private BigDecimal sensor546;
//    @JsonAlias({"SM_Exgauster\\[3:66]"})
//    private BigDecimal sensor547;
//    @JsonAlias({"SM_Exgauster\\[3:67]"})
//    private BigDecimal sensor548;
//    @JsonAlias({"SM_Exgauster\\[3:68]"})
//    private BigDecimal sensor549;
//    @JsonAlias({"SM_Exgauster\\[3:69]"})
//    private BigDecimal sensor550;
//    @JsonAlias({"SM_Exgauster\\[3:70]"})
//    private BigDecimal sensor551;
//    @JsonAlias({"SM_Exgauster\\[3:71]"})
//    private BigDecimal sensor552;
//    @JsonAlias({"SM_Exgauster\\[3:72]"})
//    private BigDecimal sensor553;
//    @JsonAlias({"SM_Exgauster\\[3:73]"})
//    private BigDecimal sensor554;
//    @JsonAlias({"SM_Exgauster\\[3:74]"})
//    private BigDecimal sensor555;
//    @JsonAlias({"SM_Exgauster\\[3:75]"})
//    private BigDecimal sensor556;
//    @JsonAlias({"SM_Exgauster\\[3:76]"})
//    private BigDecimal sensor557;
//    @JsonAlias({"SM_Exgauster\\[3:77]"})
//    private BigDecimal sensor558;
//    @JsonAlias({"SM_Exgauster\\[3:78]"})
//    private BigDecimal sensor559;
//    @JsonAlias({"SM_Exgauster\\[3:79]"})
//    private BigDecimal sensor560;
//    @JsonAlias({"SM_Exgauster\\[3:80]"})
//    private BigDecimal sensor561;
//    @JsonAlias({"SM_Exgauster\\[3:81]"})
//    private BigDecimal sensor562;
//    @JsonAlias({"SM_Exgauster\\[3:82]"})
//    private BigDecimal sensor563;
//    @JsonAlias({"SM_Exgauster\\[3:83]"})
//    private BigDecimal sensor564;
//    @JsonAlias({"SM_Exgauster\\[3:84]"})
//    private BigDecimal sensor565;
//    @JsonAlias({"SM_Exgauster\\[3:85]"})
//    private BigDecimal sensor566;
//    @JsonAlias({"SM_Exgauster\\[3:86]"})
//    private BigDecimal sensor567;
//    @JsonAlias({"SM_Exgauster\\[3:87]"})
//    private BigDecimal sensor568;
//    @JsonAlias({"SM_Exgauster\\[3:88]"})
//    private BigDecimal sensor569;
//    @JsonAlias({"SM_Exgauster\\[3:89]"})
//    private BigDecimal sensor570;
//    @JsonAlias({"SM_Exgauster\\[3:90]"})
//    private BigDecimal sensor571;
//    @JsonAlias({"SM_Exgauster\\[3:91]"})
//    private BigDecimal sensor572;
//    @JsonAlias({"SM_Exgauster\\[3:92]"})
//    private BigDecimal sensor573;
//    @JsonAlias({"SM_Exgauster\\[3:93]"})
//    private BigDecimal sensor574;
//    @JsonAlias({"SM_Exgauster\\[3:94]"})
//    private BigDecimal sensor575;
//    @JsonAlias({"SM_Exgauster\\[3:95]"})
//    private BigDecimal sensor576;
//    @JsonAlias({"SM_Exgauster\\[3:96]"})
//    private BigDecimal sensor577;
//    @JsonAlias({"SM_Exgauster\\[3:97]"})
//    private BigDecimal sensor578;
//    @JsonAlias({"SM_Exgauster\\[3:98]"})
//    private BigDecimal sensor579;
//    @JsonAlias({"SM_Exgauster\\[3:99]"})
//    private BigDecimal sensor580;
//    @JsonAlias({"SM_Exgauster\\[3:100]"})
//    private BigDecimal sensor581;
//    @JsonAlias({"SM_Exgauster\\[3:101]"})
//    private BigDecimal sensor582;
//    @JsonAlias({"SM_Exgauster\\[3:102]"})
//    private BigDecimal sensor583;
//    @JsonAlias({"SM_Exgauster\\[3:103]"})
//    private BigDecimal sensor584;
//    @JsonAlias({"SM_Exgauster\\[3:104]"})
//    private BigDecimal sensor585;
//    @JsonAlias({"SM_Exgauster\\[3:105]"})
//    private BigDecimal sensor586;
//    @JsonAlias({"SM_Exgauster\\[3:106]"})
//    private BigDecimal sensor587;
//    @JsonAlias({"SM_Exgauster\\[3:107]"})
//    private BigDecimal sensor588;
//    @JsonAlias({"SM_Exgauster\\[3:108]"})
//    private BigDecimal sensor589;
//    @JsonAlias({"SM_Exgauster\\[3:109]"})
//    private BigDecimal sensor590;
//    @JsonAlias({"SM_Exgauster\\[3:110]"})
//    private BigDecimal sensor591;
//    @JsonAlias({"SM_Exgauster\\[3:111]"})
//    private BigDecimal sensor592;
//    @JsonAlias({"SM_Exgauster\\[3:112]"})
//    private BigDecimal sensor593;
//    @JsonAlias({"SM_Exgauster\\[3:113]"})
//    private BigDecimal sensor594;
//    @JsonAlias({"SM_Exgauster\\[3:114]"})
//    private BigDecimal sensor595;
//    @JsonAlias({"SM_Exgauster\\[3:115]"})
//    private BigDecimal sensor596;
//    @JsonAlias({"SM_Exgauster\\[3:116]"})
//    private BigDecimal sensor597;
//    @JsonAlias({"SM_Exgauster\\[3:117]"})
//    private BigDecimal sensor598;
//    @JsonAlias({"SM_Exgauster\\[3:118]"})
//    private BigDecimal sensor599;
//    @JsonAlias({"SM_Exgauster\\[3:119]"})
//    private BigDecimal sensor600;
//    @JsonAlias({"SM_Exgauster\\[3:120]"})
//    private BigDecimal sensor601;
//    @JsonAlias({"SM_Exgauster\\[3:121]"})
//    private BigDecimal sensor602;
//    @JsonAlias({"SM_Exgauster\\[3:122]"})
//    private BigDecimal sensor603;
//    @JsonAlias({"SM_Exgauster\\[3:123]"})
//    private BigDecimal sensor604;
//    @JsonAlias({"SM_Exgauster\\[3:124]"})
//    private BigDecimal sensor605;
//    @JsonAlias({"SM_Exgauster\\[3:125]"})
//    private BigDecimal sensor606;
//    @JsonAlias({"SM_Exgauster\\[3:126]"})
//    private BigDecimal sensor607;
//    @JsonAlias({"SM_Exgauster\\[3:127]"})
//    private BigDecimal sensor608;
//    @JsonAlias({"SM_Exgauster\\[3:128]"})
//    private BigDecimal sensor609;
//    @JsonAlias({"SM_Exgauster\\[3:129]"})
//    private BigDecimal sensor610;
//    @JsonAlias({"SM_Exgauster\\[3:130]"})
//    private BigDecimal sensor611;
//    @JsonAlias({"SM_Exgauster\\[3:131]"})
//    private BigDecimal sensor612;
//    @JsonAlias({"SM_Exgauster\\[3:132]"})
//    private BigDecimal sensor613;
//    @JsonAlias({"SM_Exgauster\\[3:133]"})
//    private BigDecimal sensor614;
//    @JsonAlias({"SM_Exgauster\\[3:134]"})
//    private BigDecimal sensor615;
//    @JsonAlias({"SM_Exgauster\\[3:135]"})
//    private BigDecimal sensor616;
//    @JsonAlias({"SM_Exgauster\\[3:136]"})
//    private BigDecimal sensor617;
//    @JsonAlias({"SM_Exgauster\\[3:137]"})
//    private BigDecimal sensor618;
//    @JsonAlias({"SM_Exgauster\\[3:138]"})
//    private BigDecimal sensor619;
//    @JsonAlias({"SM_Exgauster\\[3:139]"})
//    private BigDecimal sensor620;
//    @JsonAlias({"SM_Exgauster\\[3:140]"})
//    private BigDecimal sensor621;
//    @JsonAlias({"SM_Exgauster\\[3:141]"})
//    private BigDecimal sensor622;
//    @JsonAlias({"SM_Exgauster\\[3:142]"})
//    private BigDecimal sensor623;
//    @JsonAlias({"SM_Exgauster\\[3:143]"})
//    private BigDecimal sensor624;
//    @JsonAlias({"SM_Exgauster\\[3:144]"})
//    private BigDecimal sensor625;
//    @JsonAlias({"SM_Exgauster\\[3:145]"})
//    private BigDecimal sensor626;
//    @JsonAlias({"SM_Exgauster\\[3:146]"})
//    private BigDecimal sensor627;
//    @JsonAlias({"SM_Exgauster\\[3:147]"})
//    private BigDecimal sensor628;
//    @JsonAlias({"SM_Exgauster\\[3:148]"})
//    private BigDecimal sensor629;
//    @JsonAlias({"SM_Exgauster\\[3:149]"})
//    private BigDecimal sensor630;
//    @JsonAlias({"SM_Exgauster\\[3:150]"})
//    private BigDecimal sensor631;
//    @JsonAlias({"SM_Exgauster\\[3:151]"})
//    private BigDecimal sensor632;
//    @JsonAlias({"SM_Exgauster\\[3:152]"})
//    private BigDecimal sensor633;
//    @JsonAlias({"SM_Exgauster\\[3:153]"})
//    private BigDecimal sensor634;
//    @JsonAlias({"SM_Exgauster\\[3:154]"})
//    private BigDecimal sensor635;
//    @JsonAlias({"SM_Exgauster\\[3:155]"})
//    private BigDecimal sensor636;
//    @JsonAlias({"SM_Exgauster\\[3:156]"})
//    private BigDecimal sensor637;
//    @JsonAlias({"SM_Exgauster\\[3:157]"})
//    private BigDecimal sensor638;
//    @JsonAlias({"SM_Exgauster\\[3:158]"})
//    private BigDecimal sensor639;
//    @JsonAlias({"SM_Exgauster\\[3:159]"})
//    private BigDecimal sensor640;
//    @JsonAlias({"SM_Exgauster\\[3:160]"})
//    private BigDecimal sensor641;
//    @JsonAlias({"SM_Exgauster\\[3:161]"})
//    private BigDecimal sensor642;
//    @JsonAlias({"SM_Exgauster\\[3:162]"})
//    private BigDecimal sensor643;
//    @JsonAlias({"SM_Exgauster\\[3:163]"})
//    private BigDecimal sensor644;
//    @JsonAlias({"SM_Exgauster\\[3:164]"})
//    private BigDecimal sensor645;
//    @JsonAlias({"SM_Exgauster\\[3:165]"})
//    private BigDecimal sensor646;
//    @JsonAlias({"SM_Exgauster\\[3:166]"})
//    private BigDecimal sensor647;
//    @JsonAlias({"SM_Exgauster\\[3:167]"})
//    private BigDecimal sensor648;
//    @JsonAlias({"SM_Exgauster\\[3:168]"})
//    private BigDecimal sensor649;
//    @JsonAlias({"SM_Exgauster\\[3:169]"})
//    private BigDecimal sensor650;
//    @JsonAlias({"SM_Exgauster\\[3:170]"})
//    private BigDecimal sensor651;
//    @JsonAlias({"SM_Exgauster\\[3:171]"})
//    private BigDecimal sensor652;
//    @JsonAlias({"SM_Exgauster\\[3:172]"})
//    private BigDecimal sensor653;
//    @JsonAlias({"SM_Exgauster\\[3:173]"})
//    private BigDecimal sensor654;
//    @JsonAlias({"SM_Exgauster\\[3:174]"})
//    private BigDecimal sensor655;
//    @JsonAlias({"SM_Exgauster\\[3:175]"})
//    private BigDecimal sensor656;
//    @JsonAlias({"SM_Exgauster\\[3:176]"})
//    private BigDecimal sensor657;
//    @JsonAlias({"SM_Exgauster\\[3:177]"})
//    private BigDecimal sensor658;
//    @JsonAlias({"SM_Exgauster\\[3:178]"})
//    private BigDecimal sensor659;
//    @JsonAlias({"SM_Exgauster\\[3:179]"})
//    private BigDecimal sensor660;
//    @JsonAlias({"SM_Exgauster\\[3:180]"})
//    private BigDecimal sensor661;
//    @JsonAlias({"SM_Exgauster\\[3:181]"})
//    private BigDecimal sensor662;
//    @JsonAlias({"SM_Exgauster\\[3:182]"})
//    private BigDecimal sensor663;
//    @JsonAlias({"SM_Exgauster\\[3:183]"})
//    private BigDecimal sensor664;
//    @JsonAlias({"SM_Exgauster\\[3:184]"})
//    private BigDecimal sensor665;
//    @JsonAlias({"SM_Exgauster\\[3:185]"})
//    private BigDecimal sensor666;
//    @JsonAlias({"SM_Exgauster\\[3:186]"})
//    private BigDecimal sensor667;
//    @JsonAlias({"SM_Exgauster\\[3:187]"})
//    private BigDecimal sensor668;
//    @JsonAlias({"SM_Exgauster\\[3:188]"})
//    private BigDecimal sensor669;
//    @JsonAlias({"SM_Exgauster\\[3:189]"})
//    private BigDecimal sensor670;
//    @JsonAlias({"SM_Exgauster\\[3:190]"})
//    private BigDecimal sensor671;
//    @JsonAlias({"SM_Exgauster\\[3:191]"})
//    private BigDecimal sensor672;
//    @JsonAlias({"SM_Exgauster\\[3:192]"})
//    private BigDecimal sensor673;
//    @JsonAlias({"SM_Exgauster\\[3:193]"})
//    private BigDecimal sensor674;
//    @JsonAlias({"SM_Exgauster\\[3:194]"})
//    private BigDecimal sensor675;
//    @JsonAlias({"SM_Exgauster\\[3:195]"})
//    private BigDecimal sensor676;
//    @JsonAlias({"SM_Exgauster\\[3:196]"})
//    private BigDecimal sensor677;
//    @JsonAlias({"SM_Exgauster\\[3:197]"})
//    private BigDecimal sensor678;
//    @JsonAlias({"SM_Exgauster\\[3:198]"})
//    private BigDecimal sensor679;
//    @JsonAlias({"SM_Exgauster\\[3:199]"})
//    private BigDecimal sensor680;
//    @JsonAlias({"SM_Exgauster\\[3:200]"})
//    private BigDecimal sensor681;
//    @JsonAlias({"SM_Exgauster\\[3:201]"})
//    private BigDecimal sensor682;
//    @JsonAlias({"SM_Exgauster\\[3:202]"})
//    private BigDecimal sensor683;
//    @JsonAlias({"SM_Exgauster\\[3:203]"})
//    private BigDecimal sensor684;
//    @JsonAlias({"SM_Exgauster\\[3:204]"})
//    private BigDecimal sensor685;
//    @JsonAlias({"SM_Exgauster\\[3:205]"})
//    private BigDecimal sensor686;
//    @JsonAlias({"SM_Exgauster\\[3:206]"})
//    private BigDecimal sensor687;
//    @JsonAlias({"SM_Exgauster\\[3:207]"})
//    private BigDecimal sensor688;
//    @JsonAlias({"SM_Exgauster\\[3:208]"})
//    private BigDecimal sensor689;
//    @JsonAlias({"SM_Exgauster\\[3:209]"})
//    private BigDecimal sensor690;
//    @JsonAlias({"SM_Exgauster\\[3:210]"})
//    private BigDecimal sensor691;
//    @JsonAlias({"SM_Exgauster\\[3:211]"})
//    private BigDecimal sensor692;
//    @JsonAlias({"SM_Exgauster\\[3:212]"})
//    private BigDecimal sensor693;
//    @JsonAlias({"SM_Exgauster\\[3:213]"})
//    private BigDecimal sensor694;
//    @JsonAlias({"SM_Exgauster\\[3:214]"})
//    private BigDecimal sensor695;
//    @JsonAlias({"SM_Exgauster\\[3:215]"})
//    private BigDecimal sensor696;
//    @JsonAlias({"SM_Exgauster\\[3:216]"})
//    private BigDecimal sensor697;
//    @JsonAlias({"SM_Exgauster\\[3:217]"})
//    private BigDecimal sensor698;
//    @JsonAlias({"SM_Exgauster\\[3:218]"})
//    private BigDecimal sensor699;
//    @JsonAlias({"SM_Exgauster\\[3:219]"})
//    private BigDecimal sensor700;
//    @JsonAlias({"SM_Exgauster\\[3:220]"})
//    private BigDecimal sensor701;
//    @JsonAlias({"SM_Exgauster\\[3:221]"})
//    private BigDecimal sensor702;
//    @JsonAlias({"SM_Exgauster\\[3:222]"})
//    private BigDecimal sensor703;
//    @JsonAlias({"SM_Exgauster\\[3:223]"})
//    private BigDecimal sensor704;
//    @JsonAlias({"SM_Exgauster\\[3:224]"})
//    private BigDecimal sensor705;
//    @JsonAlias({"SM_Exgauster\\[3:225]"})
//    private BigDecimal sensor706;
//    @JsonAlias({"SM_Exgauster\\[3:226]"})
//    private BigDecimal sensor707;
//    @JsonAlias({"SM_Exgauster\\[3:227]"})
//    private BigDecimal sensor708;
//    @JsonAlias({"SM_Exgauster\\[3:228]"})
//    private BigDecimal sensor709;
//    @JsonAlias({"SM_Exgauster\\[3:229]"})
//    private BigDecimal sensor710;
//    @JsonAlias({"SM_Exgauster\\[3:230]"})
//    private BigDecimal sensor711;
//    @JsonAlias({"SM_Exgauster\\[3.0]"})
//    private BigDecimal sensor712;
//    @JsonAlias({"SM_Exgauster\\[3.1]"})
//    private BigDecimal sensor713;
//    @JsonAlias({"SM_Exgauster\\[4:0]"})
//    private BigDecimal sensor714;
//    @JsonAlias({"SM_Exgauster\\[4:1]"})
//    private BigDecimal sensor715;
//    @JsonAlias({"SM_Exgauster\\[4:3]"})
//    private BigDecimal sensor716;
//    @JsonAlias({"SM_Exgauster\\[4:7]"})
//    private BigDecimal sensor717;
//    @JsonAlias({"SM_Exgauster\\[4:8]"})
//    private BigDecimal sensor718;
//    @JsonAlias({"SM_Exgauster\\[4:10]"})
//    private BigDecimal sensor719;
//    @JsonAlias({"SM_Exgauster\\[4.0]"})
//    private BigDecimal sensor720;
//    @JsonAlias({"SM_Exgauster\\[4.1]"})
//    private BigDecimal sensor721;
//    @JsonAlias({"SM_Exgauster\\[4.2]"})
//    private BigDecimal sensor722;
//    @JsonAlias({"SM_Exgauster\\[4.3]"})
//    private BigDecimal sensor723;
//    @JsonAlias({"SM_Exgauster\\[4.4]"})
//    private BigDecimal sensor724;
//    @JsonAlias({"SM_Exgauster\\[4.5]"})
//    private BigDecimal sensor725;
//    @JsonAlias({"SM_Exgauster\\[4.6]"})
//    private BigDecimal sensor726;
//    @JsonAlias({"SM_Exgauster\\[4.7]"})
//    private BigDecimal sensor727;
//    @JsonAlias({"SM_Exgauster\\[4.8]"})
//    private BigDecimal sensor728;
//    @JsonAlias({"SM_Exgauster\\[4.9]"})
//    private BigDecimal sensor729;
//    @JsonAlias({"SM_Exgauster\\[5:0]"})
//    private BigDecimal sensor730;
//    @JsonAlias({"SM_Exgauster\\[5:1]"})
//    private BigDecimal sensor731;
//    @JsonAlias({"SM_Exgauster\\[5:2]"})
//    private BigDecimal sensor732;
//    @JsonAlias({"SM_Exgauster\\[5:3]"})
//    private BigDecimal sensor733;
//    @JsonAlias({"SM_Exgauster\\[5:4]"})
//    private BigDecimal sensor734;
//    @JsonAlias({"SM_Exgauster\\[5:5]"})
//    private BigDecimal sensor735;
//    @JsonAlias({"SM_Exgauster\\[5:6]"})
//    private BigDecimal sensor736;
//    @JsonAlias({"SM_Exgauster\\[5:7]"})
//    private BigDecimal sensor737;
//    @JsonAlias({"SM_Exgauster\\[5:8]"})
//    private BigDecimal sensor738;
//    @JsonAlias({"SM_Exgauster\\[5:9]"})
//    private BigDecimal sensor739;
//    @JsonAlias({"SM_Exgauster\\[5:10]"})
//    private BigDecimal sensor740;
//    @JsonAlias({"SM_Exgauster\\[5:11]"})
//    private BigDecimal sensor741;
//    @JsonAlias({"SM_Exgauster\\[5:12]"})
//    private BigDecimal sensor742;
//    @JsonAlias({"SM_Exgauster\\[5:13]"})
//    private BigDecimal sensor743;
//    @JsonAlias({"SM_Exgauster\\[5.0]"})
//    private BigDecimal sensor744;
//    @JsonAlias({"SM_Exgauster\\[5.1]"})
//    private BigDecimal sensor745;
//    @JsonAlias({"SM_Exgauster\\[5.2]"})
//    private BigDecimal sensor746;
//    @JsonAlias({"SM_Exgauster\\[5.3]"})
//    private BigDecimal sensor747;
//    @JsonAlias({"SM_Exgauster\\[5.4]"})
//    private BigDecimal sensor748;
//    @JsonAlias({"SM_Exgauster\\[5.5]"})
//    private BigDecimal sensor749;
//    @JsonAlias({"SM_Exgauster\\[5.6]"})
//    private BigDecimal sensor750;
//    @JsonAlias({"SM_Exgauster\\[5.7]"})
//    private BigDecimal sensor751;
//    @JsonAlias({"SM_Exgauster\\[5.8]"})
//    private BigDecimal sensor752;
//    @JsonAlias({"SM_Exgauster\\[5.9]"})
//    private BigDecimal sensor753;
//    @JsonAlias({"SM_Exgauster\\[6:0]"})
//    private BigDecimal sensor754;
//    @JsonAlias({"SM_Exgauster\\[6:1]"})
//    private BigDecimal sensor755;
//    @JsonAlias({"SM_Exgauster\\[6:2]"})
//    private BigDecimal sensor756;
//    @JsonAlias({"SM_Exgauster\\[6.0]"})
//    private BigDecimal sensor757;
//    @JsonAlias({"SM_Exgauster\\[7:0]"})
//    private BigDecimal sensor758;
//    @JsonAlias({"SM_Exgauster\\[7:1]"})
//    private BigDecimal sensor759;
//    @JsonAlias({"SM_Exgauster\\[7:2]"})
//    private BigDecimal sensor760;
//    @JsonAlias({"SM_Exgauster\\[7.0]"})
//    private BigDecimal sensor761;
//    @JsonAlias({"SM_Exgauster\\[8:0]"})
//    private BigDecimal sensor762;
//    @JsonAlias({"SM_Exgauster\\[8:1]"})
//    private BigDecimal sensor763;
//    @JsonAlias({"SM_Exgauster\\[8:2]"})
//    private BigDecimal sensor764;
//    @JsonAlias({"SM_Exgauster\\[8.0]"})
//    private BigDecimal sensor765;
//
//    @Override
//    public String toString() {
//        return "RealRecord{" +
//                "moment='" + moment + '\'' +
//                ", sensor1=" + sensor1 +
//                  '}';
//    }
//}
