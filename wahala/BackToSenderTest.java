import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BackToSenderTest{

	@Test
	public void testThatTheDeliveryIsLessthan50percent(){
		//Given
		int numberOfSales = 25;
		
		//When
		int expectedRiderPayment = BackToSender.CalculatePayment(numberOfSales);

		//check
		int actualRiderPayment = 9000;
		assertEquals(actualRiderPayment, expectedRiderPayment);
	}

	@Test
	public void testThatTheDeliveryIsBetween50to59percent(){
		//Given
		int numberOfSales = 50;
		
		//When
		int expectedRiderPayment = BackToSender.CalculatePayment(numberOfSales);

		//check
		int actualRiderPayment = 15000;
		assertEquals(actualRiderPayment, expectedRiderPayment);
	}

	@Test
	public void testThatTheDeliveryIsBetween60to69percent(){
		//Given
		int numberOfSales = 60;
		
		//When
		int expectedRiderPayment = BackToSender.CalculatePayment(numberOfSales);

		//check
		int actualRiderPayment = 20000;
		assertEquals(actualRiderPayment, expectedRiderPayment);
	}

@Test
	public void testThatTheDeliveryIsGreaterThanOrEqualTo70percent(){
		//Given
		int numberOfSales = 80;
		
		//When
		int expectedRiderPayment = BackToSender.CalculatePayment(numberOfSales);

		//check
		int actualRiderPayment = 45000;
		assertEquals(actualRiderPayment, expectedRiderPayment);
	}

}
