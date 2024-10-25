package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes;

import aa.qh;
import android.view.View;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import dj.e;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import pr.a;
import t9.t0;
import wz.h;
/* compiled from: AttributeItem.kt */
/* loaded from: classes2.dex */
public final class AttributeItem extends a<AttributeViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final AttributeItemViewModel f27427f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27428g;

    /* renamed from: h  reason: collision with root package name */
    private final int f27429h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27430i;

    /* compiled from: AttributeItem.kt */
    /* loaded from: classes2.dex */
    public static final class AttributeViewHolder extends b.c<AttributeItem> {

        /* renamed from: a  reason: collision with root package name */
        private final qh f27431a;

        /* renamed from: b  reason: collision with root package name */
        private final h f27432b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AttributeViewHolder(aa.qh r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27431a = r3
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2 r3 = new g00.a<dj.e>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2
                    static {
                        /*
                            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2 r0 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2
                            r0.<init>()
                            
                            // error: 0x0005: SPUT  
  (r0 I:com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2)
 com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2.a com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 0
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2.<init>():void");
                    }

                    @Override // g00.a
                    /* renamed from: b */
                    public final dj.e invoke() {
                        /*
                            r1 = this;
                            dj.d$a r0 = dj.d.f54279a
                            dj.e r0 = r0.invoke()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2.invoke():dj.e");
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ dj.e invoke() {
                        /*
                            r1 = this;
                            dj.e r0 = r1.invoke()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$imageViewer$2.invoke():java.lang.Object");
                    }
                }
                wz.h r3 = kotlin.c.a(r3)
                r2.f27432b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem.AttributeViewHolder.<init>(aa.qh):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e i() {
            return (e) this.f27432b.getValue();
        }

        @Override // kr.b.c
        /* renamed from: h */
        public void b(AttributeItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            qh qhVar = this.f27431a;
            qhVar.U(item.f27428g);
            qhVar.h0(item.f27427f);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f27428g), null, null, new AttributeItem$AttributeViewHolder$bindView$2(item, this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f27428g), null, null, new AttributeItem$AttributeViewHolder$bindView$3(item, this, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: j */
        public void e(AttributeItem item) {
            o.i(item, "item");
            item.f27427f.f().j();
            item.f27427f.g().j();
        }
    }

    public AttributeItem(AttributeItemViewModel attributeViewModel, s lifecycle) {
        o.i(attributeViewModel, "attributeViewModel");
        o.i(lifecycle, "lifecycle");
        this.f27427f = attributeViewModel;
        this.f27428g = lifecycle;
        this.f27429h = t0.f70215g4;
        this.f27430i = attributeViewModel.hashCode();
    }

    @Override // kr.m
    public int getType() {
        return this.f27430i;
    }

    @Override // pr.a
    public int t() {
        return this.f27429h;
    }

    @Override // pr.a
    /* renamed from: x */
    public AttributeViewHolder u(View v11) {
        o.i(v11, "v");
        qh f02 = qh.f0(v11);
        o.h(f02, "bind(...)");
        return new AttributeViewHolder(f02);
    }
}
