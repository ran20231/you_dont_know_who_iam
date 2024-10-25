package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem;

import aa.si;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import sj.c;
import t9.r0;
import t9.t0;
import t9.y0;
/* compiled from: DescriptionItem.kt */
/* loaded from: classes2.dex */
public final class DescriptionItem extends pr.a<DescriptionViewHolder> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f27386j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f27387k = 8;

    /* renamed from: f  reason: collision with root package name */
    private final jb.a f27388f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27389g;

    /* renamed from: h  reason: collision with root package name */
    private final int f27390h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27391i;

    /* compiled from: DescriptionItem.kt */
    /* loaded from: classes2.dex */
    public static final class DescriptionViewHolder extends b.c<DescriptionItem> {

        /* renamed from: a  reason: collision with root package name */
        private final si f27392a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DescriptionViewHolder(aa.si r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27392a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem.DescriptionItem.DescriptionViewHolder.<init>(aa.si):void");
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(DescriptionItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            si siVar = this.f27392a;
            siVar.U(item.w());
            siVar.h0(item.v());
            BuildersKt__Builders_commonKt.launch$default(t.a(item.w()), null, null, new DescriptionItem$DescriptionViewHolder$bindView$2$1(item.v(), this, item, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: h */
        public void e(DescriptionItem item) {
            o.i(item, "item");
            item.v().c().j();
        }
    }

    /* compiled from: DescriptionItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(TextView textView, Boolean bool) {
            o.i(textView, "<this>");
            SpannableStringBuilder append = new SpannableStringBuilder().append(textView.getResources().getText(y0.f70364a4)).append((CharSequence) " ");
            o.h(append, "append(...)");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.b.getColor(textView.getContext(), c.J));
            int length = append.length();
            append.append(textView.getResources().getText(y0.f70426df));
            append.setSpan(foregroundColorSpan, length, append.length(), 17);
            textView.setText(append);
        }
    }

    public DescriptionItem(jb.a descriptionViewModel, s lifeCycle) {
        o.i(descriptionViewModel, "descriptionViewModel");
        o.i(lifeCycle, "lifeCycle");
        this.f27388f = descriptionViewModel;
        this.f27389g = lifeCycle;
        this.f27390h = t0.f70313u4;
        this.f27391i = r0.f69980l7;
    }

    public static final void y(TextView textView, Boolean bool) {
        f27386j.a(textView, bool);
    }

    @Override // kr.m
    public int getType() {
        return this.f27391i;
    }

    @Override // pr.a
    public int t() {
        return this.f27390h;
    }

    public final jb.a v() {
        return this.f27388f;
    }

    public final s w() {
        return this.f27389g;
    }

    @Override // pr.a
    /* renamed from: x */
    public DescriptionViewHolder u(View v11) {
        o.i(v11, "v");
        si f02 = si.f0(v11);
        o.h(f02, "bind(...)");
        return new DescriptionViewHolder(f02);
    }
}
