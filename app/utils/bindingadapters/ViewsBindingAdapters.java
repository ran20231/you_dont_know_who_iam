package com.forsale.app.utils.bindingadapters;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.app.utils.itemutils.ViewMargins;
import com.forsale.app.utils.itemutils.ViewPadding;
import com.google.android.material.chip.Chip;
import i3.b;
import i3.d;
import i3.e;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import t9.p0;
import t9.q0;
import wz.p;
import zi.l;
import zi.m;
/* compiled from: ViewsBindingAdapters.kt */
/* loaded from: classes3.dex */
public final class ViewsBindingAdapters {

    /* renamed from: a */
    public static final ViewsBindingAdapters f40083a = new ViewsBindingAdapters();

    /* compiled from: ViewsBindingAdapters.kt */
    /* loaded from: classes3.dex */
    public static final class ThrottleAction {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ ThrottleAction[] $VALUES;
        public static final ThrottleAction UNCLICKABLE = new ThrottleAction("UNCLICKABLE", 0);
        public static final ThrottleAction DISABLE = new ThrottleAction("DISABLE", 1);

        private static final /* synthetic */ ThrottleAction[] $values() {
            return new ThrottleAction[]{UNCLICKABLE, DISABLE};
        }

        static {
            ThrottleAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ThrottleAction(String str, int i11) {
            super(str, i11);
        }

        public static a00.a<ThrottleAction> getEntries() {
            return $ENTRIES;
        }

        public static ThrottleAction valueOf(String str) {
            return (ThrottleAction) Enum.valueOf(ThrottleAction.class, str);
        }

        public static ThrottleAction[] values() {
            return (ThrottleAction[]) $VALUES.clone();
        }
    }

    /* compiled from: ViewsBindingAdapters.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40084a;

        static {
            int[] iArr = new int[ThrottleAction.values().length];
            try {
                iArr[ThrottleAction.UNCLICKABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThrottleAction.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40084a = iArr;
        }
    }

    /* compiled from: ViewsBindingAdapters.kt */
    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f40086a;

        /* renamed from: b */
        final /* synthetic */ View f40087b;

        c(boolean z11, View view) {
            this.f40086a = z11;
            this.f40087b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            o.i(animation, "animation");
            super.onAnimationEnd(animation);
            if (!this.f40086a) {
                this.f40087b.setVisibility(8);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            o.i(animation, "animation");
            super.onAnimationStart(animation);
            if (this.f40086a) {
                this.f40087b.setVisibility(0);
            }
        }
    }

    private ViewsBindingAdapters() {
    }

    public static final void c(RecyclerView view, boolean z11) {
        o.i(view, "view");
        int dimension = (int) view.getResources().getDimension(p0.f69721u);
        if (z11) {
            view.setMinimumHeight(dimension);
        }
    }

    public static final void d(View view, float f11) {
        o.i(view, "view");
        Context context = view.getContext();
        o.h(context, "getContext(...)");
        int M0 = TypeExtensionsKt.M0(f11, context);
        view.setPadding(M0, M0, M0, M0);
    }

    public static final void e(View view, Integer num) {
        o.i(view, "<this>");
        if (num != null && num.intValue() != 0) {
            view.setBackgroundResource(num.intValue());
        }
    }

    private final float f(View view, Integer num) {
        if (num != null) {
            return view.getResources().getDimension(num.intValue());
        }
        return 0.0f;
    }

    public static final void g(View view, Integer num) {
        o.i(view, "<this>");
        if (num != null && num.intValue() != 0) {
            view.setBackground(view.getResources().getDrawable(num.intValue(), null));
        }
    }

    public static final void h(AppCompatButton appCompatButton, boolean z11) {
        int i11;
        int i12;
        o.i(appCompatButton, "<this>");
        Context context = appCompatButton.getContext();
        if (z11) {
            i11 = q0.f69761j;
        } else {
            i11 = q0.f69765k;
        }
        appCompatButton.setBackground(context.getDrawable(i11));
        Context context2 = appCompatButton.getContext();
        if (z11) {
            i12 = l8.c.f62276d;
        } else {
            i12 = l8.c.f62273a;
        }
        appCompatButton.setTextColor(context2.getColor(i12));
    }

    public static final void i(View view, boolean z11) {
        float f11;
        o.i(view, "<this>");
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.3f;
        }
        view.setAlpha(f11);
    }

    public static final void j(View view, boolean z11) {
        int i11;
        o.i(view, "<this>");
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    public static final void k(Chip chip, String str) {
        o.i(chip, "<this>");
        Glide.v(chip).w(str).x0(new b(chip));
    }

    private final int l(Float f11) {
        int d11;
        if (f11 != null) {
            d11 = i00.c.d(f11.floatValue());
            return d11;
        }
        return 0;
    }

    public static final void m(View view, float f11) {
        int d11;
        int d12;
        o.i(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        d11 = i00.c.d(f11);
        marginLayoutParams.setMargins(i11, i12, i13, d11);
        d12 = i00.c.d(f11);
        marginLayoutParams.bottomMargin = d12;
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
    }

    public static final void n(Chip chip, gj.a aVar) {
        float f11;
        float f12;
        float f13;
        Integer a11;
        Integer b11;
        Integer c11;
        Integer d11;
        o.i(chip, "<this>");
        float f14 = 0.0f;
        if (aVar != null && (d11 = aVar.d()) != null) {
            f11 = f40083a.f(chip, Integer.valueOf(d11.intValue()));
        } else {
            f11 = 0.0f;
        }
        chip.setTextStartPadding(f11);
        if (aVar != null && (c11 = aVar.c()) != null) {
            f12 = f40083a.f(chip, Integer.valueOf(c11.intValue()));
        } else {
            f12 = 0.0f;
        }
        chip.setTextEndPadding(f12);
        if (aVar != null && (b11 = aVar.b()) != null) {
            f13 = f40083a.f(chip, Integer.valueOf(b11.intValue()));
        } else {
            f13 = 0.0f;
        }
        chip.setIconStartPadding(f13);
        if (aVar != null && (a11 = aVar.a()) != null) {
            f14 = f40083a.f(chip, Integer.valueOf(a11.intValue()));
        }
        chip.setIconEndPadding(f14);
    }

    public static final void o(View view, ViewMargins viewMargins) {
        Integer num;
        Integer num2;
        Integer num3;
        o.i(view, "<this>");
        ViewsBindingAdapters viewsBindingAdapters = f40083a;
        Integer num4 = null;
        if (viewMargins != null) {
            num = viewMargins.c();
        } else {
            num = null;
        }
        Float valueOf = Float.valueOf(viewsBindingAdapters.f(view, num));
        if (viewMargins != null) {
            num2 = viewMargins.b();
        } else {
            num2 = null;
        }
        Float valueOf2 = Float.valueOf(viewsBindingAdapters.f(view, num2));
        if (viewMargins != null) {
            num3 = viewMargins.d();
        } else {
            num3 = null;
        }
        Float valueOf3 = Float.valueOf(viewsBindingAdapters.f(view, num3));
        if (viewMargins != null) {
            num4 = viewMargins.a();
        }
        p(view, valueOf, valueOf2, valueOf3, Float.valueOf(viewsBindingAdapters.f(view, num4)));
    }

    public static final void p(View view, Float f11, Float f12, Float f13, Float f14) {
        o.i(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewsBindingAdapters viewsBindingAdapters = f40083a;
        int l11 = viewsBindingAdapters.l(f11);
        int l12 = viewsBindingAdapters.l(f13);
        int l13 = viewsBindingAdapters.l(f12);
        int l14 = viewsBindingAdapters.l(f14);
        marginLayoutParams.setMarginStart(l11);
        marginLayoutParams.topMargin = l12;
        marginLayoutParams.setMarginEnd(l13);
        marginLayoutParams.bottomMargin = l14;
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
    }

    public static final void q(View view, ViewPadding viewPadding) {
        int i11;
        int i12;
        int i13;
        Integer a11;
        Integer b11;
        Integer d11;
        Integer c11;
        o.i(view, "<this>");
        int i14 = 0;
        if (viewPadding != null && (c11 = viewPadding.c()) != null) {
            i11 = (int) f40083a.f(view, Integer.valueOf(c11.intValue()));
        } else {
            i11 = 0;
        }
        if (viewPadding != null && (d11 = viewPadding.d()) != null) {
            i12 = (int) f40083a.f(view, Integer.valueOf(d11.intValue()));
        } else {
            i12 = 0;
        }
        if (viewPadding != null && (b11 = viewPadding.b()) != null) {
            i13 = (int) f40083a.f(view, Integer.valueOf(b11.intValue()));
        } else {
            i13 = 0;
        }
        if (viewPadding != null && (a11 = viewPadding.a()) != null) {
            i14 = (int) f40083a.f(view, Integer.valueOf(a11.intValue()));
        }
        view.setPaddingRelative(i11, i12, i13, i14);
    }

    public static final void r(View view, float f11) {
        int d11;
        o.i(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        d11 = i00.c.d(f11);
        marginLayoutParams.topMargin = d11;
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
    }

    public static final void s(View view, boolean z11, long j11) {
        float f11;
        o.i(view, "view");
        ViewPropertyAnimator animate = view.animate();
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        animate.alpha(f11).setDuration(j11).setListener(new c(z11, view));
    }

    public static /* synthetic */ d u(ViewsBindingAdapters viewsBindingAdapters, View view, b.r rVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f12 = 200.0f;
        }
        float f15 = f12;
        if ((i11 & 8) != 0) {
            f13 = 0.2f;
        }
        float f16 = f13;
        if ((i11 & 16) != 0) {
            f14 = 5000.0f;
        }
        return viewsBindingAdapters.t(view, rVar, f11, f15, f16, f14);
    }

    public static final void v(View view, g00.a<p> onClickListener, Float f11, ThrottleAction throttleAction) {
        o.i(view, "<this>");
        o.i(onClickListener, "onClickListener");
        view.setOnClickListener(new m(throttleAction, f11, view, onClickListener));
    }

    public static final void w(ThrottleAction throttleAction, Float f11, View this_throttledOnClick, g00.a onClickListener, View view) {
        p pVar;
        p pVar2;
        o.i(this_throttledOnClick, "$this_throttledOnClick");
        o.i(onClickListener, "$onClickListener");
        if (throttleAction == null) {
            throttleAction = ThrottleAction.DISABLE;
        }
        int i11 = a.f40084a[throttleAction.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (f11 != null) {
                    f11.floatValue();
                    ViewsExtensionsKt.p(this_throttledOnClick, f11.floatValue());
                    pVar2 = p.f75480a;
                } else {
                    pVar2 = null;
                }
                if (pVar2 == null) {
                    ViewsExtensionsKt.q(this_throttledOnClick, 0.0f, 1, null);
                }
            }
        } else {
            if (f11 != null) {
                f11.floatValue();
                ViewsExtensionsKt.N(this_throttledOnClick, f11.floatValue());
                pVar = p.f75480a;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                ViewsExtensionsKt.O(this_throttledOnClick, 0.0f, 1, null);
            }
        }
        onClickListener.invoke();
    }

    public static final void x(ShimmerFrameLayout shimmerFrameLayout, Boolean bool) {
        o.i(shimmerFrameLayout, "<this>");
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            shimmerFrameLayout.c();
        } else {
            shimmerFrameLayout.d();
        }
    }

    public static final void y(EditText editText, boolean z11) {
        o.i(editText, "<this>");
        editText.setOnFocusChangeListener(new l(editText));
    }

    public static final void z(EditText this_trimLeadingAndTrailingSpaces, View view, boolean z11) {
        CharSequence Z0;
        o.i(this_trimLeadingAndTrailingSpaces, "$this_trimLeadingAndTrailingSpaces");
        if (!z11) {
            Z0 = StringsKt__StringsKt.Z0(this_trimLeadingAndTrailingSpaces.getText().toString());
            this_trimLeadingAndTrailingSpaces.setText(Z0.toString());
        }
    }

    public final d t(View view, b.r property, float f11, float f12, float f13, float f14) {
        o.i(view, "<this>");
        o.i(property, "property");
        d dVar = new d(view, property);
        e eVar = new e(f11);
        eVar.f(f12);
        eVar.d(f13);
        dVar.t(eVar);
        dVar.l(f14);
        return dVar;
    }

    /* compiled from: ViewsBindingAdapters.kt */
    /* loaded from: classes3.dex */
    public static final class b extends p7.d<Chip, Drawable> {

        /* renamed from: g */
        final /* synthetic */ Chip f40085g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Chip chip) {
            super(chip);
            this.f40085g = chip;
        }

        @Override // p7.Target
        public void i(Drawable drawable) {
            this.f40085g.setChipIcon(drawable);
        }

        @Override // p7.Target
        /* renamed from: o */
        public void e(Drawable resource, q7.d<? super Drawable> dVar) {
            o.i(resource, "resource");
            this.f40085g.setChipIcon(resource);
        }

        @Override // p7.d
        protected void l(Drawable drawable) {
        }
    }
}
