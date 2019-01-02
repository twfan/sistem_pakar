// Generated code from Butter Knife. Do not modify!
package e.twfan.sistempakar;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Question3Activity_ViewBinding implements Unbinder {
  private Question3Activity target;

  @UiThread
  public Question3Activity_ViewBinding(Question3Activity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Question3Activity_ViewBinding(Question3Activity target, View source) {
    this.target = target;

    target.btn_ya_3 = Utils.findRequiredViewAsType(source, R.id.btn_ya_3, "field 'btn_ya_3'", Button.class);
    target.btn_tidak_3 = Utils.findRequiredViewAsType(source, R.id.btn_tidak_3, "field 'btn_tidak_3'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Question3Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_ya_3 = null;
    target.btn_tidak_3 = null;
  }
}
