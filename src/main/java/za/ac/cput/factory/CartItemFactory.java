package za.ac.cput.factory;
/* CartItemFactory.java
     Cart Item Factory class
     Author: C Smith (221242597)
     Date: 16 May 2025 */

import za.ac.cput.domain.Cart;
import za.ac.cput.domain.CartItem;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Schedule;
import za.ac.cput.util.Helper;

public class CartItemFactory {

    public static CartItem createCartItem(String cartItemId, int quantity, Cart cart, Schedule schedule, Customer customer, String movieTitle, byte[] image) {

        if (Helper.isNullOrEmpty(cartItemId) ||quantity <= 0 || cart == null || schedule == null || Helper.isNullOrEmpty(movieTitle) || image == null) {
            return null;
        }

        return new CartItem.Builder()
                .setCartItemId(cartItemId)
                .setQuantity(quantity)
                .setCart(cart)
                .setSchedule(schedule)
                .setCustomer(customer)
                .setMovieTitle(movieTitle)
                .setImage(image)
                .build();
    }
}
