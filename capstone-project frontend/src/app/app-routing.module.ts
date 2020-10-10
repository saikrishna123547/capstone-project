import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddCategoryComponent } from './add-category/add-category.component';
import { AddProductComponent } from './add-product/add-product.component';
import { AddPurchaseComponent } from './add-purchase/add-purchase.component';
import { CategoryListComponent } from './category-list/category-list.component';
import { DeleteCategoryComponent } from './delete-category/delete-category.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { DeletePurchaseComponent } from './delete-purchase/delete-purchase.component';
import { LoginComponent } from './login/login.component';
import { LoginsuccessComponent } from './loginsuccess/loginsuccess.component';
import { ProductListComponent } from './product-list/product-list.component';
import { PurchaseListComponent } from './purchase-list/purchase-list.component';
import { RegistrationComponent } from './registration/registration.component';
import { UpdateCategoryComponent } from './update-category/update-category.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { UpdatePurchaseComponent } from './update-purchase/update-purchase.component';


const routes: Routes = [
 {path:'', component:LoginComponent},
 {path:'loginsuccess',component:LoginsuccessComponent},
 {path:'registration', component:RegistrationComponent},
 {path:'login', component:LoginComponent},
 
 
 //  for product controller
 {path:'addProduct',component:AddProductComponent},
 {path:'deleteProduct',component:DeleteProductComponent},
 {path:'updateProduct',component:UpdateProductComponent},
 {path:'productList',component:ProductListComponent},

  //  for purchase controller 
  {path:'addPurchase',component:AddPurchaseComponent},
  {path:'deletePurchase',component:DeletePurchaseComponent},
  {path:'updatePurchase',component:UpdatePurchaseComponent},
  {path:'purchaseList',component:PurchaseListComponent},

   //  for category controller
 {path:'addCategory',component:AddCategoryComponent},
 {path:'deleteCategory',component:DeleteCategoryComponent},
 {path:'updateCategory',component:UpdateCategoryComponent},
 {path:'categoryList',component:CategoryListComponent}

 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
