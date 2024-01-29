package intellispaces.templateengine.model.element;

import intellispaces.templateengine.exception.ResolveTemplateException;
import intellispaces.templateengine.model.TextPosition;
import intellispaces.templateengine.model.value.Value;

import java.util.Map;

/**
 * Template element.
 */
public interface TemplateElement {

  /**
   * Position of the element in template source.
   */
  TextPosition position();

  /**
   * Element length, characters.
   */
  default int length() {
    return text().length();
  }

  /**
   * Element text.
   */
  String text();

  /**
   * Element type.
   */
  TemplateElementType type();

  String resolve(Map<String, Value> params) throws ResolveTemplateException;
}