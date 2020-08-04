<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>포퍼먼스</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/performance/ex01.css">
   
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/performance/slick.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/performance/slick-theme.css"/>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!-- <script type="text/javascript" src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/performance/slick.min.js"></script>
    <script>
        $(document).ready(function(){
            $('.aa').slick({
                lazyLoad: 'ondemand',
                slidesToShow: 3,
                slidesToScroll: 1
            });
        });
        </script>
</head>

<body>
    <header id="main_header">
        <div id="top_header">
            <div class="logo">
                <a href="main.ws">
                    <h1>CALVIN FLY</h1>
                </a>
            </div>
            <div class="main_gnb">
                <ul id="main_list">
                    <li>
                        <a href="man2.ws">남성</a>
                        <div>
                            <div>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">하이라이트</li>
                                    <li><a href="#" class="red">중반판매</a></li>
                                    <li><a href="#">신제품</a></li>
                                    <li><a href="#">Body Stretch Denim</a></li>
                                    <li><a href="#">CK ONE</a></li>
                                    <li><a href="#">선물 아이디어♥</a></li>
                                    <li><a href="#">커플 세트</a></li>
                                    <li><a href="#">오프 시즌</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">의류</li>
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
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">액세서리</li>
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
                                <ul class="sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/performance/top_submenu_1.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="women.ws">여성</a>
                        <div>
                            <div>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">하이라이트</li>
                                    <li><a href="#" class="red">중반판매</a></li>
                                    <li><a href="#">신제품</a></li>
                                    <li><a href="#">Body Stretch Denim</a></li>
                                    <li><a href="#">CK ONE</a></li>
                                    <li><a href="#">선물 아이디어♥</a></li>
                                    <li><a href="#">커플 세트</a></li>
                                    <li><a href="#">오프 시즌</a></li>
                                </ul>
                                <ul class="sub_menu">

                                    <li class="sub_menu_top">의류</li>
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
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">액세서리</li>
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
                                <ul class="sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/performance/top_submenu_2.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="Kids.ws">키즈</a>
                        <div>
                            <div>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">하이라이트</li>
                                    <li><a href="#">남아 신제품</a></li>
                                    <li><a href="#">여아신제품</a></li>
                                    <li><a href="#" class="red">오프 시즌</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">남아</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">티셔츠 + 탑</a></li>
                                    <li><a href="#">스웨트셔츠 + 후디</a></li>
                                    <li><a href="#">재킷 + 코트</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">남아 액세서리</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">여아</li>
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
                                <ul class="sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/performance/top_submenu_3.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="#">언더웨어</a>
                        <div>
                            <div>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">하이라이트</li>
                                    <li><a href="#">CK ONE</a></li>
                                    <li><a href="#">커플 세트</a></li>
                                    <li><a href="#" class="red">오프 시즌</a></li>
                                    <li><a href="#">New Arrivals</a></li>
                                    <li><a href="#">T-shirt Bras</a></li>
                                    <li><a href="#">CK Black</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">남성</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">트렁크</a></li>
                                    <li><a href="#">브리프</a></li>
                                    <li><a href="#">박서</a></li>
                                    <li><a href="#">박서 브리프</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">여성</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">브라</a></li>
                                    <li><a href="#">팬티</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">남아</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">여아</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">멀티팩</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">잠옷</a></li>
                                </ul>
                                <ul class="sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/performance/top_submenu_4.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="포퍼먼스.ws">퍼포먼스</a>
                        <div>
                            <div>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">하이라이트</li>
                                    <li><a href="#">행아웃 에디션</a></li>
                                    <li><a href="#">워크아웃 필수 아이템</a></li>
                                    <li><a href="#" class="red">오프시즌</a></li>
                                    <li><a href="#">New Arrivals</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">남성용 의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">재킷 + 코트</a></li>
                                    <li><a href="#">스웨트셔츠 + 후디</a></li>
                                    <li><a href="#">티셔츠 + 탱크</a></li>
                                    <li><a href="#">타이즈</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">수영복</a></li>
                                    <li><a href="#">워크아웃 액세서리</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">여성용 의류</li>
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
                                <ul class="sub_img">
                                    <img src="${pageContext.request.contextPath}/resources/performance/top_submenu_5.jpg" alt="이미지">
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a href="off.ws" class="neon">오프시즌</a>
                        <div>
                            <div>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">남성용 의류</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">자켓 + 아우터</a></li>
                                    <li><a href="#">스웨터/a></li>
                                    <li><a href="#">셔츠</a></li>
                                    <li><a href="#">티셔츠 + 탱크</a></li>
                                    <li><a href="#">팬츠 + 쇼츠</a></li>
                                    <li><a href="#">잠옷</a></li>
                                    <li><a href="#">언더웨어</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">남성용 액세서리</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">백 + 백팩</a></li>
                                    <li><a href="#">지갑 + 액세서리 소품</a></li>
                                    <li><a href="#">벨트</a></li>
                                    <li><a href="#">신발</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">여성용 의류</li>
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
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">여성용 액세서리</li>
                                    <li><a href="#">모든 제품 쇼핑</a></li>
                                    <li><a href="#">핸드백 + 파우치</a></li>
                                    <li><a href="#">지갑 + 액세서리 소품</a></li>
                                    <li><a href="#">구두 + 샌들</a></li>
                                    <li><a href="#">벨트</a></li>
                                </ul>
                                <ul class="sub_menu">
                                    <li class="sub_menu_top">아동용</li>
                                    <li><a href="#">남아용 제품 쇼핑</a></li>
                                    <li><a href="#">여아용 제품 쇼핑</a></li>
                                </ul>
                            </div>
                        </div>
                    </li>

                </ul>
            </div>
            <div class="side_bar">
                <ul>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/resources/performance/top1.png" alt="검색이미지" widt=20px>검색</a></li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/resources/performance/top2.png" alt="매장검색이미지">매장 검색</a></li>
                    <li><a href="login.ws"><img src="${pageContext.request.contextPath}/resources/performance/top3.png" alt="로그인이미지">로그인</a></li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/resources/performance/top4.png" alt="백이미지">백</a></li>
                </ul>
            </div>
        </div>
    </header>
    <div id="content">
        <div class="top">
            <div id="left_top">
                <h1>ALL YEAR STRONG</h1>
                <h2>대담함. 스트리트 스타일.</h2>
                <h2>업그레이드된 아웃도어 및 인도어 워크아웃.</h2>
                <ul>
                    <li><a href="#">남성용 구매하기</a></li>
                    <li><a href="#">여성용 구매하기</a></li>
                </ul>
            </div>
            <div id="right_top">
                <div class="slide">
                    <ul>
                        <li><img src="${pageContext.request.contextPath}/resources/performance/dd.jpg" alt="이미지" width="1170" height="600"></li>
                        <li><img src="${pageContext.request.contextPath}/resources/performance/cc.png" alt="이미지" width="1170" height="600"></li>
                        <li><img src="${pageContext.request.contextPath}/resources/performance/bb.jpg" alt="이미지" width="1170" height="600"></li>
                        <li><img src="${pageContext.request.contextPath}/resources/performance/aa.png" alt="이미지" width="1170" height="600"></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="center">
            <div class="menu_box1">
                <div class="image">
                    <a href="#"><img src="${pageContext.request.contextPath}/resources/performance/dd.jpg" alt="이미지" width="750" height="600"></a>
                </div>
                <div class="image">
                    <a href="#"><img src="${pageContext.request.contextPath}/resources/performance/aa.png" alt="이미지" width="750" height="600"></a>
                </div>
            </div>
                <div class="menu_box2">
                    <div class="center_menu_box">
                        <div class="center_text">
                            <h1>START YOUR ACTIVE ROUTINE</h1>
                            <p><br>모던 컷라인. 피커부 디테일. 그 어느 때보다도 더욱 강력해진<br>산뜻한 봄 액티브웨어.</p>
                        </div>
                    </div>
                    <div class="bottom">
                        <div id="bottom_menu">
                            <div id="left_bottom">
                                <ul>
                                    <li><a href="man.ws">남성용 구매하기</a></li>
                                    <li><a href="#">여성용 구매하기</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="bottom_bt">
                        <div class="bt_text">
                            <h1>최신 트렌드 </h1>
                            <li>
                                <p>지금 인기있는 아이템으로 옷장을 새롭게 채우세요.</p>
                            </li>
                        </div>
                        <div class="bottom_pho">
                            <div class="aa">
                                <div><img src="${pageContext.request.contextPath}/resources/performance/1.jpg" title="Funky roots"></div>
                                <div><img src="${pageContext.request.contextPath}/resources/performance/2.jpg" title="The long and winding road"></div>
                                <div><img src="${pageContext.request.contextPath}/resources/performance/3.jpg" title="Happy trees"></div>
                              </div>

                        </div>

                    </div>
                </div>
        </div>
    </div>
    <footer id="main_footer">
        <div class="footer_menu">
            <h1>CALVIN FLY</h1>
            <ul class="footer_list">
                <h1>고객 서비스</h1>
                <li><a href="#">주문 조회/반품</a></li>
                <li><a href="#">배송 정보</a></li>
                <li><a href="#">반품 정책</a></li>
                <li><a href="#">결제 방법</a></li>
                <li><a href="#">친구에게 추천하기</a></li>
            </ul>
            <ul class="footer_list">
                <h1>탐색</h1>
                <li><a href="#">남성</a></li>
                <li><a href="#">여성</a></li>
                <li><a href="#">언더웨어</a></li>
                <li><a href="#">기능성</a></li>
                <li><a href="#">세일</a></li>
            </ul>
            <ul class="footer_list">
                <h1>소개</h1>
                <li><a href="#">CALVIN FLY소개</a></li>
                <li><a href="#">직업</a></li>
            </ul>
            <ul class="footer_list">
                <h1>연락처</h1>
                <li><a href="#">이메일</a></li>
                <li><a href="#">연락처</a></li>
            </ul>
        </div>
        <div id="sns_img">
            <a href=""><img src="${pageContext.request.contextPath}/resources/performance/facebook.png" alt=""></a>
            <a href=""><img src="${pageContext.request.contextPath}/resources/performance/instagram.png" alt=""></a>
            <a href=""><img src="${pageContext.request.contextPath}/resources/performance/blog.png" alt=""></a>
            <a href=""><img src="${pageContext.request.contextPath}/resources/performance/twitter.png" alt=""></a>
        </div>
        <div id="footer_bottom">
            <ul>
                <ul id="footer_left_bottom">
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