package intellispaces.common.templateengine.element;

public interface SetMarkers {

  static SetMarkerBuilder build() {
    return new SetMarkerBuilder();
  }
}