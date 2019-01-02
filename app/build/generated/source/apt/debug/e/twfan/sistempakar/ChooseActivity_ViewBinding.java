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

public class ChooseActivity_ViewBinding implements Unbinder {
  private ChooseActivity target;

  @UiThread
  public ChooseActivity_ViewBinding(ChooseActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChooseActivity_ViewBinding(ChooseActivity target, View source) {
    this.target = target;

    target.btn_siup = Utils.findRequiredViewAsType(source, R.id.btn_siup, "field 'btn_siup'", Button.class);
    target.btn_tdp = Utils.findRequiredViewAsType(source, R.id.btn_tdp, "field 'btn_tdp'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChooseActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_siup = null;
    target.btn_tdp = null;
  }
}
