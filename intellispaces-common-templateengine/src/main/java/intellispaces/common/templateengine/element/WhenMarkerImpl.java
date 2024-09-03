package intellispaces.common.templateengine.element;

import intellispaces.common.templateengine.expression.Expression;
import intellispaces.common.templateengine.expression.value.Value;

import java.util.Map;

class WhenMarkerImpl extends AbstractElement implements MarkerWhen {
  private final Expression condition;

  WhenMarkerImpl(TemplateElementContext context, Expression condition) {
    super(context);
    this.condition = condition;
  }

  @Override
  public TemplateElementType type() {
    return TemplateElementTypes.MarkerWhen;
  }

  @Override
  public Expression condition() {
    return condition;
  }

  @Override
  public String resolve(Map<String, Value> variables) {
    return ElementFunctions.resolve(this, variables);
  }

  @Override
  public String toString() {
    return "{{when " + condition.statement() + "}}";
  }
}