package com.forsale.app.features.categories.listingdetails.newui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.SwitchCompat;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import kotlin.jvm.internal.o;
import t9.q0;
/* compiled from: NewListingDetailsBindingAdapters.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27330a = new a();

    /* compiled from: NewListingDetailsBindingAdapters.kt */
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0293a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27331a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f27332b;

        static {
            int[] iArr = new int[NewListingDetailsViewModel.FavouriteState.values().length];
            try {
                iArr[NewListingDetailsViewModel.FavouriteState.IS_FAVOURITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewListingDetailsViewModel.FavouriteState.IS_NOT_FAVOURITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27331a = iArr;
            int[] iArr2 = new int[SwitchStates.values().length];
            try {
                iArr2[SwitchStates.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SwitchStates.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f27332b = iArr2;
        }
    }

    /* compiled from: NewListingDetailsBindingAdapters.kt */
    /* loaded from: classes2.dex */
    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f27333a;

        b(View.OnClickListener onClickListener) {
            this.f27333a = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            o.i(widget, "widget");
            this.f27333a.onClick(widget);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            o.i(ds2, "ds");
            ds2.setUnderlineText(false);
        }
    }

    private a() {
    }

    public static final void a(ImageButton favouriteButton, NewListingDetailsViewModel.FavouriteState favouriteState) {
        boolean z11;
        int i11;
        o.i(favouriteButton, "favouriteButton");
        if (favouriteState != NewListingDetailsViewModel.FavouriteState.PENDING) {
            z11 = true;
        } else {
            z11 = false;
        }
        favouriteButton.setEnabled(z11);
        if (favouriteState == null) {
            favouriteButton.setImageResource(q0.D0);
        }
        if (favouriteState == null) {
            i11 = -1;
        } else {
            i11 = C0293a.f27331a[favouriteState.ordinal()];
        }
        if (i11 != 1) {
            if (i11 == 2) {
                favouriteButton.setImageResource(q0.D0);
                return;
            }
            return;
        }
        favouriteButton.setImageResource(q0.E0);
    }

    public static final void b(SwitchCompat switchButton, SwitchStates switchStates) {
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        o.i(switchButton, "switchButton");
        if (switchStates != SwitchStates.INTIAL) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        switchButton.setVisibility(i11);
        if (switchStates != SwitchStates.PENDING) {
            z12 = true;
        } else {
            z12 = false;
        }
        switchButton.setEnabled(z12);
        if (switchStates == null) {
            switchButton.setChecked(false);
        }
        if (switchStates == null) {
            i12 = -1;
        } else {
            i12 = C0293a.f27332b[switchStates.ordinal()];
        }
        if (i12 != 1) {
            if (i12 == 2) {
                switchButton.setChecked(false);
                return;
            }
            return;
        }
        switchButton.setChecked(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(android.widget.TextView r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, android.view.View.OnClickListener r12) {
        /*
            java.lang.String r0 = "textView"
            kotlin.jvm.internal.o.i(r8, r0)
            java.lang.String r0 = "onClickListener"
            kotlin.jvm.internal.o.i(r12, r0)
            if (r9 != 0) goto Le
            java.lang.String r9 = ""
        Le:
            if (r11 == 0) goto L15
            int r11 = r11.intValue()
            goto L1f
        L15:
            android.content.Context r11 = r8.getContext()
            int r0 = sj.c.J
            int r11 = r11.getColor(r0)
        L1f:
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L2c
            boolean r2 = kotlin.text.k.v(r10)
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = r1
            goto L2d
        L2c:
            r2 = r0
        L2d:
            if (r2 == 0) goto L33
            r8.setText(r9)
            return
        L33:
            r2 = 2
            r3 = 0
            java.lang.String r4 = "%s"
            boolean r2 = kotlin.text.k.N(r9, r4, r1, r2, r3)
            if (r2 == 0) goto L51
            kotlin.jvm.internal.w r2 = kotlin.jvm.internal.w.f61809a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r10
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r9 = java.lang.String.format(r9, r0)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.o.h(r9, r0)
            goto L65
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = " "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
        L65:
            r2 = r9
            com.forsale.app.features.categories.listingdetails.newui.a$b r9 = new com.forsale.app.features.categories.listingdetails.newui.a$b
            r9.<init>(r12)
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r2)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r3 = r10
            int r0 = kotlin.text.k.a0(r2, r3, r4, r5, r6, r7)
            int r2 = r10.length()
            int r2 = r2 + r0
            r12.setSpan(r9, r0, r2, r1)
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            r9.<init>(r11)
            int r10 = r10.length()
            int r10 = r10 + r0
            r11 = 33
            r12.setSpan(r9, r0, r10, r11)
            r8.setText(r12)
            android.text.method.MovementMethod r9 = android.text.method.LinkMovementMethod.getInstance()
            r8.setMovementMethod(r9)
            r8.setHighlightColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.a.c(android.widget.TextView, java.lang.String, java.lang.String, java.lang.Integer, android.view.View$OnClickListener):void");
    }
}
