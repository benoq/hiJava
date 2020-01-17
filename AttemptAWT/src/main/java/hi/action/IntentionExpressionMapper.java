package hi.action;

public class IntentionExpressionMapper {
	
	public static Expression mapIntentionToExpression(Intention pIntention) {
		
		//fastTest
		if (pIntention.isIntentionUnderstood) {
			return Expression.YES;
			
		} else
		return Expression.UNDEFINED_EXPRESSION;
	}

}
