import 'package:get/get.dart';
import 'package:zz_flutter_shop/entity/dto/category_tree_model.dart';
import 'package:zz_flutter_shop/entity/response/home_app_index_response.dart';
import 'package:zz_flutter_shop/http/http_manager.dart';
import 'package:zz_flutter_shop/service/api_urls.dart';

///分类页接口服务
class CategoryApiService extends GetxService {

  ///获取分类树
  Future<CategoryTreeModel> getCategoryTree() async {
    var result = await HttpManager.getInstance().get(url: ApiUrls.categoryTree);
    return CategoryTreeModel.fromJson(result);
  }

  ///获取分类页banner
  Future<HomeAppIndexResponse> getCategoryBanner() async {
    var result = await HttpManager.getInstance().post(url: ApiUrls.homeRecommendAppIndex);
    return HomeAppIndexResponse.fromJson(result);
  }

}