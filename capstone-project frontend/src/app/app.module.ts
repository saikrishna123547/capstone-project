import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {HttpClientModule} from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { RegistrationComponent } from './registration/registration.component';
import { RegistrationService } from './registration.service';
import { LoginsuccessComponent } from './loginsuccess/loginsuccess.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ProductListComponent } from './product-list/product-list.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { AddPurchaseComponent } from './add-purchase/add-purchase.component';
import { DeletePurchaseComponent } from './delete-purchase/delete-purchase.component';
import { UpdatePurchaseComponent } from './update-purchase/update-purchase.component';
import { PurchaseListComponent } from './purchase-list/purchase-list.component';
import { AddCategoryComponent } from './add-category/add-category.component';
import { DeleteCategoryComponent } from './delete-category/delete-category.component';
import { UpdateCategoryComponent } from './update-category/update-category.component';
import { CategoryListComponent } from './category-list/category-list.component';
import { ProductService } from './product.service';
import { PurchaseService } from './purchase.service';
import { CategoryService } from './category.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    LoginsuccessComponent,
    AddProductComponent,
    ProductListComponent,
    UpdateProductComponent,
    DeleteProductComponent,
    AddPurchaseComponent,
    DeletePurchaseComponent,
    UpdatePurchaseComponent,
    PurchaseListComponent,
    AddCategoryComponent,
    DeleteCategoryComponent,
    UpdateCategoryComponent,
    CategoryListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [RegistrationService,ProductService,PurchaseService,CategoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
