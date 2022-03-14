public abstract class NonTerminalExpression implements Expression {
  private Expression leftNode;
  private Expression rightNode;

  public NonTerminalExpression(Expression l, Expression r) {
    setLeftNode(l);
    setRightNode(r);
  }
  public void setLeftNode(Expression node) {
    leftNode = node;
  }
  public void setRightNode(Expression node) {
    rightNode = node;
  }
  public Expression getLeftNode() {
    return leftNode;
  }
  public Expression getRightNode() {
    return rightNode;
  }
}// NonTerminalExpression

class AddExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) +
           getRightNode().evaluate(c);
  }
  public AddExpression(Expression l, Expression r) {
    super(l, r);
  }
}// AddExpression

class SubtractExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) -
           getRightNode().evaluate(c);
  }
  public SubtractExpression(Expression l, Expression r) {
    super(l, r);
  }
}// SubtractExpression

class MultiplyExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) *
           getRightNode().evaluate(c);
  }
  public MultiplyExpression(Expression l, Expression r) {
    super(l, r);
  }// MultiplyExpression
}
 class ModularExpression extends NonTerminalExpression {
    public int evaluate(Context c){
    	return (getLeftNode().evaluate(c)) %
               (getRightNode().evaluate(c));
    }
    public ModularExpression (Expression l, Expression r){
        super(l, r);
    }
}// ModularExpression

class IntegerDivisionExpression extends NonTerminalExpression{
    public int evaluate(Context c){
    	try {
            return getLeftNode().evaluate(c) /
            getRightNode().evaluate(c);
    	}catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0" + e);
    	};
    	return 0;
      	
    }
    public IntegerDivisionExpression (Expression l, Expression r){
    	super(l, r);
    }
}// IntegerDivisionExpression

class PowerExpression extends NonTerminalExpression{
    public int evaluate(Context c){
    	return (int) Math.pow(
                (getLeftNode().evaluate(c)),(getRightNode().evaluate(c)));
    }
    public PowerExpression (Expression l, Expression r){
        super(l, r);
    }
}// PowerExpression



