import 'package:get/get.dart';
import 'package:shopzz_flutter_app/controller/category_page_controller.dart';
import 'package:shopzz_flutter_app/controller/language_controller.dart';
import 'package:shopzz_flutter_app/controller/main_page_controller.dart';
import 'package:shopzz_flutter_app/controller/recommend_page_controller.dart';

///所有控制器的加载器，通过Get.lazyPut进行懒注入
class AllControllerBinding implements Bindings {

  @override
  void dependencies() {
    Get.lazyPut<MainPageController>(() => MainPageController());
    Get.lazyPut<LanguageController>(() => LanguageController());
    Get.lazyPut<RecommendPageController>(() => RecommendPageController());
    Get.lazyPut<CategoryPageController>(() => CategoryPageController());
  }
}