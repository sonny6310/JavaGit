<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

    <!--초기화-->
    <style>
        *{margin:0; padding:0; 
        /* border:1px solid black; */
        }

        body{
            font-family: sans-serif; width:1920px; margin: 0 auto;
            min-width: 1920px;
        }
        li{list-style: none;}
        a{text-decoration:none; color:black;}
    </style>

    <!--header style-->
    <style>
        #main_header {
    
            width: 1920px;
            height: 80px;
            position: fixed;
            top: 0;
            z-index: 10;
        }
    
        #main_header>#top_header {
            height: 80px;
            background-color: white;
        }
    
        #main_header>#top_header>.logo {
            float: left;
            width: 20%;
            box-sizing: border-box;
            text-align: center;
            line-height: 80px;
            background-color: white;
    
            margin-left: 5%;
        }
    
        #main_header>#top_header>.main_gnb {
            float: left;
            width: 50%;
            box-sizing: border-box;
            margin: 0 auto;
            background-color: white;
            margin-left: 5%;
            color: gray;
        }
    
        #main_header>#top_header>.main_gnb>ul {
            overflow: hidden;
        }
    
        #main_header>#top_header>.main_gnb>ul>li {
            float: left;
            margin-top: 30px;
        }
        
        #main_header>#top_header>.main_gnb>#main_list>li {
            
            font-size: 13px;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>a {
            padding: 20px;
            font-size: 13px;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div {
            margin-top: 20px;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div {
            overflow: hidden;
            position: absolute;
            width: 100%;
            left: 0;
            background-color: white;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div>.sub_menu {
            display: none;
            float: left;
            font-size: 12px;
    
            height: 400px;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div>.sub_menu>li {
            margin-top: 5px;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div>.sub_img {
            display: none;
            float: right;
            margin-top: 1%;
            margin-right: 10%;
            margin-bottom: 2%;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div>ul>li {
            margin-left: 100px;
            padding: 5px 0;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div>ul:first-child {
            margin-left: 80px;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>a:hover+div>div>ul {
            display: block;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div:hover>ul {
            display: block;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div>ul>.sub_menu_top {
            font-size: 20px;
            margin-top: 15px;
        }
    
        #main_header>#top_header>.main_gnb>#main_list .red {
            color: red;
        }
    
        #main_header>#top_header>.main_gnb>#main_list>li>div>div>ul>img {
            width: 350px;
            height: 400px;
        }
    
        #main_header>#top_header>.side_bar {
            float: left;
            width: 20%;
            box-sizing: border-box;
            line-height: 80px;
    
            background-color: white;
        }
    
        #main_header>#top_header>.side_bar>ul {
            overflow: hidden;
        }
    
        #main_header>#top_header>.side_bar>ul>li {
            float: left;
            box-sizing: border-box;
            padding-right: 20px;
            font-size: 12px;
        }
    
        .neon {
            color: red;
            animation: neon 1s ease infinite;
            -moz-animation: neon 1s ease infinite;
            -webkit-animation: neon 1s ease infinite;
        }
    
        @keyframes neon {
    
            0%,
            100% {
                text-shadow: 0 0 1vw #FA1C16, 0 0 3vw #FA1C16, 0 0 10vw #FA1C16, 0 0 10vw #FA1C16, 0 0 .4vw #FED128;
                color: #FED128;
            }
    
            50% {
                text-shadow: 0 0 .5vw #800E0B, 0 0 1.5vw #800E0B, 0 0 5vw #800E0B, 0 0 5vw #800E0B, 0 0 .2vw #800E0B;
                color: #806914;
            }
        }
    </style>


    <!--content style-->    
    <style>
        #off_ct{
            width: 100%;            
            padding-top: 150px; /*main header의 높이까지 생각*/                    
        }
        #off_ct > #ct_top {
            width: 100%;
            
            text-align: center;
            overflow: hidden;            
        }
        #off_ct > #ct_top > .top_name{                        
            color: crimson;
            font-size: x-large;
        }
        #off_ct > #ct_top > .top_list {                        
            width: 550px;
            height: 100px;
            margin: 0 auto;

        }
        #off_ct > #ct_top > .top_list > ul > li {            
            float: left;
            padding-top: 30px;
            padding-right: 50px;
        }
        #off_ct > #ct_top > .top_list > ul > li > a{
            color: navy;
            text-decoration: solid;
            font-size: large;
        }

        #off_ct > #ct_list {
            overflow: hidden;
            height:100%;
            
        }
        #off_ct > #filt {
            display: none;            
        }        
        #off_ct > #ct_aside > #filter {
            width: 80px;
            height: 40px;            

            line-height: 40px;
            text-align: center;
            border: 1px solid black;
            color: cornsilk;
            
            cursor: pointer;
            
            background-color: black;
        }
        #off_ct > #ct_aside > #filter > .down:hover {
            cursor: pointer;
        }
        #off_ct > #filt + #ct_aside > #aside_left {
            display: block;
        }
        #off_ct > #filt:checked + #ct_aside > #aside_left {
            display: none;
        }
        
        #off_ct > #ct_aside > #aside_left > .aside_ul > ul > li{
            padding: 10px 0;
            text-align: right;
            border-bottom: 1px solid black;            
        }
        #off_ct > #ct_aside > #aside_left > .aside_ul > ul > li>a{
            margin-right: 10px;
        }

        #off_ct > #ct_list > div {
            float: left;
        }
        #off_ct > #ct_aside {
            padding-left: 250px;
            padding-right: 100px;
            position:sticky;
            top:12%; left:0;
            float:left;
        }
        
        /* 사진배열 */
        #off_ct > #ct_list > #ct {
            top:0;
            margin-right: 0;
            margin-left: 20px;
            width: 1450px;
            margin-bottom: 100px;
        }
        #off_ct > #ct_list > #ct > .list {
            overflow: hidden;
        }
        #off_ct > #ct_list > #ct > .list > .image {
            float: left;
            margin: 30px 20px;

            text-align: left;            
        }
        #off_ct > #ct_list > #ct > .list > .image > div{
            overflow: hidden;
            padding-top: 3px;
        }
        #off_ct > #ct_list > #ct > .list > .image > div > .line{
            margin-right: 10px;
            
            text-decoration: line-through;
        }
        #off_ct > #ct_list > #ct > .list > .image > div > .red1{
            color: red;
        }
        #off_ct > #ct_list > #ct > .list > .image > div > .red2{
            float: right;
            color: red;
        }
        #off_ct > #ct_list > #ct > .list > .image > div > li{
            float: left;
        }
        #off_ct > #ct_list > #ct > .list > .image > li{
           padding-top: 3px;
           text-shadow: 4px 3px 3px silver;
        }

    </style>

    
    <!--footer style-->
    <style>
        #main_footer{
            width:100%;
            background-color: black;
            color:white;
        }
        #main_footer > .footer_menu{
            overflow: hidden; 
            margin-left: 13%;
        }
        #main_footer > .footer_menu > h1{margin-top:20px;}
        #main_footer > .footer_menu > .footer_list{
            float:left;
            margin-top: 30px;
            margin-left: 0;
            margin-right: 10%;
            margin-bottom:30px;
        }
        #main_footer > .footer_menu > .footer_list >li { margin : 10px}
        #main_footer > .footer_menu > .footer_list > li > a{ color:white;}
        
        #main_footer > #sns_img{ margin-left:13%; padding-bottom:2%;}
        #main_footer > #sns_img > a {padding:0 1px;}
        #main_footer > #sns_img > a > img:nth-child(1){margin-left:30px;}

        #main_footer > #footer_bottom{ color:white; padding-bottom:2%;}
        #main_footer > #footer_bottom > ul{overflow:hidden;}
        #main_footer > #footer_bottom > ul > #footer_left_bottom{float: left;overflow: hidden;margin-left:13%;}
        #main_footer > #footer_bottom > ul > #footer_right_bottom{width:40%;float:right;overflow: hidden;margin-right:10%;}
        #main_footer > #footer_bottom > ul > ul > li{float:left;}
        #main_footer > #footer_bottom > ul > #footer_right_bottom > li{border-right:1px solid white;padding: 0 2%;}
        #main_footer > #footer_bottom > ul > #footer_right_bottom > li:last-child{border:none;}
        #main_footer > #footer_bottom > ul > ul > li > a{color:white;}
        
    </style>
<body>
    
    <header id = "main_header">
        <div id = "top_header">
            <div class="logo">
                <a href="main.ws"><h1>CALVIN FLY</h1></a>
            </div>
            <div class="main_gnb">
                <ul id="main_list">
                    <li>
                        <a href="man2.ws">남성</a>
                        <div>
                            <div>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">하이라이트</li>
                                    <li><a href="#" class = "red">중반판매</a></li>
                                    <li><a href="#">신제품</a></li>
                                    <li><a href="#">Body Stretch Denim</a></li>
                                    <li><a href="#">CK ONE</a></li>
                                    <li><a href="#">선물 아이디어♥</a></li>
                                    <li><a href="#">커플 세트</a></li>
                                    <li><a href="#">오프 시즌</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">재킷</a></li>
                                    <li><a href="#">코트</a></li>
                                    <li><a href="#">스웨터</a></li>
                                    <li><a href="#">셔츠</a></li>
                                    <li><a href="#">데님 팬츠</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                    <li><a href="#">액티브웨어</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">액세서리</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">백 + 백팩</a></li>
                                    <li><a href="#">지갑 + 액세서리 소품</a></li>
                                    <li><a href="#">벨트</a></li>
                                    <li><a href="#">시계 + 주얼리</a></li>
                                    <li><a href="#">부츠 + 스니커즈</a></li>
                                    <li><a href="#">양말</a></li>
                                    <li><a href="#">선글라스</a></li>
                                    <li><a href="#">캡 + 스카프</a></li>
                                </ul>
                                <ul class = "sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/site/top_submenu_1.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>    
                    </li>
                    <li>
                        <a href="women.ws">여성</a>
                        <div>
                            <div>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">하이라이트</li>
                                    <li><a href="#" class = "red">중반판매</a></li>
                                    <li><a href="#">신제품</a></li>
                                    <li><a href="#">Body Stretch Denim</a></li>
                                    <li><a href="#">CK ONE</a></li>
                                    <li><a href="#">선물 아이디어♥</a></li>
                                    <li><a href="#">커플 세트</a></li>
                                    <li><a href="#">오프 시즌</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    
                                    <li class = "sub_menu_top">의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">재킷</a></li>
                                    <li><a href="#">코트</a></li>
                                    <li><a href="#">스웨터</a></li>
                                    <li><a href="#">셔츠</a></li>
                                    <li><a href="#">데님 팬츠</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">스커트</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">액세서리</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">핸드백 + 파우치</a></li>
                                    <li><a href="#">지갑 + 액세서리 소품</a></li>
                                    <li><a href="#">보석</a></li>
                                    <li><a href="#">시계</a></li>
                                    <li><a href="#">신발 + 스니커즈</a></li>
                                    <li><a href="#">삭스 + 양말류</a></li>
                                    <li><a href="#">선글라스</a></li>
                                    <li><a href="#">벨트</a></li>
                                    <li><a href="#">캡 + 비니</a></li>
                                </ul>
                                <ul class = "sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/site/top_submenu_2.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>    
                    </li>
                    <li>
                        <a href="Kids.ws">키즈</a>
                        <div>
                            <div>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">하이라이트</li>
                                    <li><a href="#">남아 신제품</a></li>
                                    <li><a href="#">여아신제품</a></li>
                                    <li><a href="#" class = "red">오프 시즌</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">남아</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">티셔츠 + 탑</a></li>
                                    <li><a href="#">스웨트셔츠 + 후디</a></li>
                                    <li><a href="#">재킷 + 코트</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">남아 액세서리</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">여아</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">티셔츠 + 탑</a></li>
                                    <li><a href="#">스웨트셔츠 + 후디</a></li>
                                    <li><a href="#">드레스</a></li>
                                    <li><a href="#">재킷 + 코트</a></li>
                                    <li><a href="#">스커트</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">여아 액세서리</a></li>
                                </ul>
                                <ul class = "sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/site/top_submenu_3.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="#">언더웨어</a>
                        <div>
                            <div>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">하이라이트</li>
                                    <li><a href="#">CK ONE</a></li>
                                    <li><a href="#">커플 세트</a></li>
                                    <li><a href="#" class = "red">오프 시즌</a></li>
                                    <li><a href="#">New Arrivals</a></li>
                                    <li><a href="#">T-shirt Bras</a></li>
                                    <li><a href="#">CK Black</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">남성</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">트렁크</a></li>
                                    <li><a href="#">브리프</a></li>
                                    <li><a href="#">박서</a></li>
                                    <li><a href="#">박서 브리프</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">여성</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">브라</a></li>
                                    <li><a href="#">팬티</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">남아</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">여아</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class = "sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/site/top_submenu_4.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="포퍼먼스.ws">퍼포먼스</a>
                        <div>
                            <div>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">하이라이트</li>
                                    <li><a href="#">행아웃 에디션</a></li>
                                    <li><a href="#">워크아웃 필수 아이템</a></li>
                                    <li><a href="#" class = "red">오프시즌</a></li>
                                    <li><a href="#">New Arrivals</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">남성용 의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">재킷 + 코트</a></li>
                                    <li><a href="#">스웨트셔츠 + 후디</a></li>
                                    <li><a href="#">티셔츠 + 탱크</a></li>
                                    <li><a href="#">타이즈</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">워크아웃 액세서리</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">여성용 의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">스포츠 브라</a></li>
                                    <li><a href="#">레깅스</a></li>
                                    <li><a href="#">재킷 + 코트</a></li>
                                    <li><a href="#">스웨트셔츠 + 후디</a></li>
                                    <li><a href="#">티셔츠 + 탱크</a></li>
                                    <li><a href="#">드레스 + 오버롤</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">스커트</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">워크아웃 액세서리</a></li>
                                </ul>
                                <ul class = "sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/site/top_submenu_5.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="off.ws" class = "neon">오프시즌</a>
                        <div>
                            <div>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">남성용 의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">자켓 + 아우터</a></li>
                                    <li><a href="#">스웨터</a></li>
                                    <li><a href="#">셔츠</a></li>
                                    <li><a href="#">티셔츠 + 탱크</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">잠옷</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">남성용 액세서리</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">백 + 백팩</a></li>
                                    <li><a href="#">지갑 + 액세서리 소품</a></li>
                                    <li><a href="#">벨트</a></li>
                                    <li><a href="#">신발</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">여성용 의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">재킷</a></li>
                                    <li><a href="#">스웨터 + 카디건</a></li>
                                    <li><a href="#">셔츠</a></li>
                                    <li><a href="#">상의</a></li>
                                    <li><a href="#">티셔츠 + 탱크</a></li>
                                    <li><a href="#">드레스 + 오버롤</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">잠옷</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">여성용 액세서리</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">핸드백 + 파우치</a></li>
                                    <li><a href="#">지갑 + 액세서리 소품</a></li>
                                    <li><a href="#">구두 + 샌들</a></li>
                                    <li><a href="#">벨트</a></li>
                                </ul>
                                <ul class = "sub_menu">
                                    <li class = "sub_menu_top">아동용</li>
                                    <li><a href="#">남아용 제품 쇼핑</a></li>
                                    <li><a href="#">여아용 제품 쇼핑</a></li>
                                </ul>
                            </div>
                        </div>
                    </li>

                </ul>
            </div>
            <div class = "side_bar">
                <ul>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/resources/off_season/top1.png" alt="검색이미지" widt=20px>검색</a></li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/resources/off_season/top2.png" alt="매장검색이미지">매장 검색</a></li>
                    <li><a href="login.ws"><img src="${pageContext.request.contextPath}/resources/off_season/top3.png" alt="로그인이미지">로그인</a></li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/resources/off_season/top4.png" alt="백이미지">백</a></li>
                </ul>
            </div>
        </div>
        
    </header>
    

    <div id="off_ct">

        <div id="ct_top">

            <div class="top_name">                
                <h1>시 즌 오 프</h1>                
            </div>
    
            <div class="top_list">
                <ul>
                    <li><a href="#">ALL</a></li>
                    <li><a href="#">남성</a></li>
                    <li><a href="#">여성</a></li>
                    <li><a href="#">남아</a></li>
                    <li><a href="#">여아</a></li>
                    <li><a href="#">유니섹스</a></li>
                </ul>
            </div>
        </div>        
        <input type="checkbox" id="filt">
        <div id="ct_aside">
    
            <div id="filter">
                <label class="down" for="filt">필터+</label>
                <!-- <li><a href="#">필터+</a></li> -->
            </div>
    
            <div id="aside_left">
                <div class="aside_ul">
                    <ul>
                        <li><a href="#">가격</a></li>
                        <li><a href="#">사이즈</a></li>
                        <li><a href="#">성별</a></li>
                        <li><a href="#">핏</a></li>
                        <li><a href="#">컬러</a></li>
                    </ul>
                </div>
            </div>
    
        </div>
        <div id="ct_list">
            <div id="ct">
        
                <div class="list">
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p11.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 349,000</li>
                            <li class="red1">KRW 174,500</li>
                            <li class="red2">50% 할인</li>
                        </div>
        
                        <li><a href="#">CK50 ALL-OVER LOGO 재킷</a></li>
                    </div>
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p12.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 229,000</li>
                            <li class="red1">KRW 160,300</li>
                            <li class="red2">30% 할인</li>
                        </div>
        
                        <li><a href="#">CK50 SLIM 테이퍼드 진</a></li>
                    </div>
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p13.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 299,000</li>
                            <li class="red1">KRW 149,500</li>
                            <li class="red2">50% 할인</li>
                        </div>
        
                        <li><a href="#">SHORT 다운 재킷</a></li>
                    </div>
        
                </div>
        
                <div class="list">
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p21.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 299,000</li>
                            <li class="red1">KRW 149,500</li>
                            <li class="red2">50% 할인</li>
                        </div>
        
                        <li><a href="#">SHORT 다운 재킷</a></li>
                    </div>
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p22.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 199,000</li>
                            <li class="red1">KRW 139,300</li>
                            <li class="red2">30% 할인</li>
                        </div>
        
                        <li><a href="#">CK50 MODERN 테이퍼드 진</a></li>
                    </div>
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p23.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 199,000</li>
                            <li class="red1">KRW 99,500</li>
                            <li class="red2">50% 할인</li>
                        </div>
        
                        <li><a href="#">SHORT 다운 베스트</a></li>
                    </div>
        
                </div>
        
                <div class="list">
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p31.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 199,000</li>
                            <li class="red1">KRW 99,500</li>
                            <li class="red2">50% 할인</li>
                        </div>
        
                        <li><a href="#">SHORT 다운 베스트</a></li>
                    </div>
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p32.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 149,000</li>
                            <li class="red1">KRW 74,500</li>
                            <li class="red2">50% 할인</li>
                        </div>
        
                        <li><a href="#">MODERN SWEAT HOODED 풀오버 스웨터</a></li>
                    </div>
        
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/resources/off_season/p33.jpg" width="400px" alt="">
        
                        <div>
                            <li class="line">KRW 149,000</li>
                            <li class="red1">KRW 74,500</li>
                            <li class="red2">50% 할인</li>
                        </div>
        
                        <li><a href="#">MODERN SWEAT HOODED 풀오버 스웨터</a></li>
                    </div>
        
                </div>
            </div>
            
        </div>
    </div>


    <footer id = "main_footer">
        <div class = "footer_menu">
            <h1>CALVIN FLY</h1>
            <ul class = "footer_list">
                <h1>고객 서비스</h1>
                <li><a href="#">주문 조회/반품</a></li>
                <li><a href="#">배송 정보</a></li>
                <li><a href="#">반품 정책</a></li>
                <li><a href="#">결제 방법</a></li>
                <li><a href="#">친구에게 추천하기</a></li>
            </ul>
            <ul class = "footer_list">
                <h1>탐색</h1>
                <li><a href="#">남성</a></li>
                <li><a href="#">여성</a></li>
                <li><a href="#">언더웨어</a></li>
                <li><a href="#">기능성</a></li>
                <li><a href="#">세일</a></li>
            </ul>
            <ul class = "footer_list">
                <h1>소개</h1>
                <li><a href="#">CALVIN FLY소개</a></li>
                <li><a href="#">직업</a></li>
            </ul>
            <ul class = "footer_list">
                <h1>연락처</h1>
                <li><a href="#">이메일</a></li>
                <li><a href="#">연락처</a></li>
            </ul>
        </div>
        <div id = "sns_img">
            <a href=""><img src="${pageContext.request.contextPath}/resources/site/facebook.png" alt=""></a>
            <a href=""><img src="${pageContext.request.contextPath}/resources/site/instagram.png" alt=""></a>
            <a href=""><img src="${pageContext.request.contextPath}/resources/site/blog.png" alt=""></a>
            <a href=""><img src="${pageContext.request.contextPath}/resources/site/twitter.png" alt=""></a>
        </div>
        <div id = "footer_bottom">
            <ul>
                <ul id = "footer_left_bottom">
                    <li>CALVIN FLY은 전 세계 목화 농업 개선을 위해 The Better Cotton Initiative와 협력합니다.</li>
                </ul>
                <ul id="footer_right_bottom">
                    <li>캘리포니아 공급망 투명성 & UK 현대판 노예제도 선언</li>
                    <li><a href="#">개인정보 보호정책</a></li>
                    <li><a href="#">이용 약관</a></li>
                </ul>
                
            </ul>
        </div>
    </footer>

</body>
</html>