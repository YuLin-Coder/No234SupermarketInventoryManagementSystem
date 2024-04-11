import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import chengyunshang from '@/views/modules/chengyunshang/list'
    import xiaoshoudingdan from '@/views/modules/xiaoshoudingdan/list'
    import shangpinxinxi from '@/views/modules/shangpinxinxi/list'
    import gangwei from '@/views/modules/gangwei/list'
    import rukuxinxi from '@/views/modules/rukuxinxi/list'
    import kehu from '@/views/modules/kehu/list'
    import bumen from '@/views/modules/bumen/list'
    import caigouxinxi from '@/views/modules/caigouxinxi/list'
    import shangpinleibie from '@/views/modules/shangpinleibie/list'
    import cangkuxinxi from '@/views/modules/cangkuxinxi/list'
    import chukuxinxi from '@/views/modules/chukuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/gongyingshang',
        name: '供应商',
        component: gongyingshang
      }
      ,{
	path: '/chengyunshang',
        name: '承运商',
        component: chengyunshang
      }
      ,{
	path: '/xiaoshoudingdan',
        name: '销售订单',
        component: xiaoshoudingdan
      }
      ,{
	path: '/shangpinxinxi',
        name: '商品信息',
        component: shangpinxinxi
      }
      ,{
	path: '/gangwei',
        name: '岗位',
        component: gangwei
      }
      ,{
	path: '/rukuxinxi',
        name: '入库信息',
        component: rukuxinxi
      }
      ,{
	path: '/kehu',
        name: '客户',
        component: kehu
      }
      ,{
	path: '/bumen',
        name: '部门',
        component: bumen
      }
      ,{
	path: '/caigouxinxi',
        name: '采购信息',
        component: caigouxinxi
      }
      ,{
	path: '/shangpinleibie',
        name: '商品类别',
        component: shangpinleibie
      }
      ,{
	path: '/cangkuxinxi',
        name: '仓库信息',
        component: cangkuxinxi
      }
      ,{
	path: '/chukuxinxi',
        name: '出库信息',
        component: chukuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
