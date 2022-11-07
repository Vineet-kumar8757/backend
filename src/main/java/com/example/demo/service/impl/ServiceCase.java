package com.example.demo.service.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.ResponseClassses.CartResponse;
import com.example.demo.ResponseClassses.Product;
import com.example.demo.ResponseClassses.UsersResonse;
import com.example.demo.model.ActiveLogin;
import com.example.demo.model.Carts;
import com.example.demo.model.OrderedTable;
import com.example.demo.model.Products;
import com.example.demo.model.Result;
import com.example.demo.model.Users;
import com.example.demo.repository.OrdersOfUsers;

public interface ServiceCase {
	public boolean addUsers(Users user);
	public ResponseEntity<Result> loginCheck(String email, String password);
	public boolean checkLoginActive(long login);
	public void deleteActiveLogin(long UserId);
	public Users getProfile(long UserId);
	public ResponseEntity<Products> addingProduct(Products pro);
	public ResponseEntity<Products> updatingProduct(Product pro);
	public ResponseEntity<Products> getingProductById(long productId);
	public ResponseEntity<List<Products>> gettingProductsByCategory(String catgry);
	public ResponseEntity<List<Products>> gettingProductsBySearch(String searchString);
	public ResponseEntity addingToCart(String userId, String productId);
	public ResponseEntity<List<CartResponse>> getCartByUserId(long UserId);
	public ResponseEntity<CartResponse> getCartbyUserIdAndCartItemId(long userId, long cartItemId);
	public String removeProductByUserIDFromCart(long userId, long productId);
	public ResponseEntity<CartResponse> updatingQuantityUsingUserIdAndProductId(long quantity, long userId, long productId);
	public ResponseEntity<OrderedTable> additionOfDataToOrderedTable(long userId);
	public ResponseEntity<OrdersOfUsers> gettingOrderDetails(long userId);
	public ResponseEntity<Result> updateUser(UsersResonse userResponse);
	public ResponseEntity<List<Products>> gettingFilteredCategoryProducts(String category, Product product);
	public ResponseEntity<List<Products>> gettingAllProducts();
}
