package com.forsale.app.features.postad.extrainfo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.a1;
import t9.q0;
import t9.r0;
import t9.t0;
import wz.h;
/* compiled from: RectangleCheckBox.kt */
/* loaded from: classes2.dex */
public final class RectangleCheckBox extends ConstraintLayout {
    private final h L;
    private final h M;
    private final h N;
    private final h O;
    private final h P;
    private final h Q;
    private final h R;
    private boolean S;
    private int T;
    private String U;
    private String V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RectangleCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.i(context, "context");
    }

    private final ImageView getCheckImageView() {
        Object value = this.O.getValue();
        o.h(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getIconImageView() {
        Object value = this.P.getValue();
        o.h(value, "getValue(...)");
        return (ImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutInflater getInflater() {
        return (LayoutInflater) this.L.getValue();
    }

    private final ConstraintLayout getLayout() {
        Object value = this.N.getValue();
        o.h(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    private final TextView getSubTitleTextView() {
        Object value = this.R.getValue();
        o.h(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTitleTextView() {
        Object value = this.Q.getValue();
        o.h(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        Object value = this.M.getValue();
        o.h(value, "getValue(...)");
        return (View) value;
    }

    private final void y(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a1.f69213l, 0, 0);
            o.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.S = obtainStyledAttributes.getBoolean(a1.f69215n, false);
            this.T = obtainStyledAttributes.getResourceId(a1.f69214m, -1);
            String string = obtainStyledAttributes.getString(a1.f69217p);
            o.f(string);
            this.U = string;
            String string2 = obtainStyledAttributes.getString(a1.f69216o);
            o.f(string2);
            this.V = string2;
            obtainStyledAttributes.recycle();
        }
    }

    public final void A() {
        this.S = !this.S;
        x();
    }

    public final int getIconImage() {
        return this.T;
    }

    public final String getSubTitle() {
        return this.V;
    }

    public final String getTitle() {
        return this.U;
    }

    public final void setChecked(boolean z11) {
        this.S = z11;
    }

    public final void setIconImage(int i11) {
        this.T = i11;
    }

    public final void setSubTitle(String str) {
        o.i(str, "<set-?>");
        this.V = str;
    }

    public final void setTitle(String str) {
        o.i(str, "<set-?>");
        this.U = str;
    }

    public final void x() {
        if (this.S) {
            getCheckImageView().setImageDrawable(androidx.core.content.b.getDrawable(getContext(), q0.S1));
        } else {
            getCheckImageView().setImageDrawable(androidx.core.content.b.getDrawable(getContext(), q0.f69813w));
        }
        if (this.T != -1) {
            getIconImageView().setImageResource(this.T);
        }
        getTitleTextView().setText(this.U);
        getSubTitleTextView().setText(this.V);
    }

    public final boolean z() {
        return this.S;
    }

    public /* synthetic */ RectangleCheckBox(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectangleCheckBox(final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        h a11;
        h a12;
        h a13;
        h a14;
        h a15;
        h a16;
        h a17;
        o.i(context, "context");
        a11 = d.a(new g00.a<LayoutInflater>() { // from class: com.forsale.app.features.postad.extrainfo.RectangleCheckBox$inflater$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final LayoutInflater invoke() {
                Object systemService = context.getSystemService("layout_inflater");
                o.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                return (LayoutInflater) systemService;
            }
        });
        this.L = a11;
        a12 = d.a(new g00.a<View>() { // from class: com.forsale.app.features.postad.extrainfo.RectangleCheckBox$view$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final View invoke() {
                LayoutInflater inflater;
                inflater = RectangleCheckBox.this.getInflater();
                return inflater.inflate(t0.f70270o3, (ViewGroup) RectangleCheckBox.this, true);
            }
        });
        this.M = a12;
        a13 = d.a(new g00.a<ConstraintLayout>() { // from class: com.forsale.app.features.postad.extrainfo.RectangleCheckBox$layout$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ConstraintLayout invoke() {
                View view;
                view = RectangleCheckBox.this.getView();
                return (ConstraintLayout) view.findViewById(r0.f70134x5);
            }
        });
        this.N = a13;
        a14 = d.a(new g00.a<ImageView>() { // from class: com.forsale.app.features.postad.extrainfo.RectangleCheckBox$checkImageView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ImageView invoke() {
                View view;
                view = RectangleCheckBox.this.getView();
                return (ImageView) view.findViewById(r0.f70014o2);
            }
        });
        this.O = a14;
        a15 = d.a(new g00.a<ImageView>() { // from class: com.forsale.app.features.postad.extrainfo.RectangleCheckBox$iconImageView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ImageView invoke() {
                View view;
                view = RectangleCheckBox.this.getView();
                return (ImageView) view.findViewById(r0.f69964k4);
            }
        });
        this.P = a15;
        a16 = d.a(new g00.a<TextView>() { // from class: com.forsale.app.features.postad.extrainfo.RectangleCheckBox$titleTextView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final TextView invoke() {
                View view;
                view = RectangleCheckBox.this.getView();
                return (TextView) view.findViewById(r0.H9);
            }
        });
        this.Q = a16;
        a17 = d.a(new g00.a<TextView>() { // from class: com.forsale.app.features.postad.extrainfo.RectangleCheckBox$subTitleTextView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final TextView invoke() {
                View view;
                view = RectangleCheckBox.this.getView();
                return (TextView) view.findViewById(r0.f70008n9);
            }
        });
        this.R = a17;
        this.T = -1;
        this.U = "";
        this.V = "";
        y(attributeSet);
        x();
    }
}
