package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem;

import aa.si;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem.DescriptionItem;
import com.forsale.app.features.more.WebModel;
import com.forsale.app.ui.WebDialogFragment;
import com.forsale.app.utils.OneShotEventHandler;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DescriptionItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem.DescriptionItem$DescriptionViewHolder$bindView$2$1", f = "DescriptionItem.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DescriptionItem$DescriptionViewHolder$bindView$2$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27393a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ jb.a f27394b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DescriptionItem.DescriptionViewHolder f27395c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DescriptionItem f27396d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptionItem$DescriptionViewHolder$bindView$2$1(jb.a aVar, DescriptionItem.DescriptionViewHolder descriptionViewHolder, DescriptionItem descriptionItem, a<? super DescriptionItem$DescriptionViewHolder$bindView$2$1> aVar2) {
        super(2, aVar2);
        this.f27394b = aVar;
        this.f27395c = descriptionViewHolder;
        this.f27396d = descriptionItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new DescriptionItem$DescriptionViewHolder$bindView$2$1(this.f27394b, this.f27395c, this.f27396d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27393a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<String> c11 = this.f27394b.c();
            final DescriptionItem.DescriptionViewHolder descriptionViewHolder = this.f27395c;
            final DescriptionItem descriptionItem = this.f27396d;
            FlowCollector<String> flowCollector = new FlowCollector<String>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem.DescriptionItem$DescriptionViewHolder$bindView$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(String str, a<? super wz.p> aVar) {
                    si siVar;
                    ViewComponentManager.FragmentContextWrapper fragmentContextWrapper;
                    Context context;
                    FragmentManager supportFragmentManager;
                    final long currentTimeMillis = System.currentTimeMillis();
                    siVar = DescriptionItem.DescriptionViewHolder.this.f27392a;
                    Context context2 = siVar.getRoot().getContext();
                    androidx.appcompat.app.d dVar = null;
                    if (context2 instanceof ViewComponentManager.FragmentContextWrapper) {
                        fragmentContextWrapper = (ViewComponentManager.FragmentContextWrapper) context2;
                    } else {
                        fragmentContextWrapper = null;
                    }
                    if (fragmentContextWrapper != null) {
                        context = fragmentContextWrapper.getBaseContext();
                    } else {
                        context = null;
                    }
                    if (context instanceof androidx.appcompat.app.d) {
                        dVar = context;
                    }
                    if (dVar != null && (supportFragmentManager = dVar.getSupportFragmentManager()) != null) {
                        final DescriptionItem descriptionItem2 = descriptionItem;
                        WebDialogFragment.C.a(new WebModel("", null, str, false, 10, null), true, supportFragmentManager, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem.DescriptionItem$DescriptionViewHolder$bindView$2$1$1$emit$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ wz.p invoke() {
                                invoke2();
                                return wz.p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DescriptionItem.this.v().b().invoke(null, Long.valueOf((System.currentTimeMillis() - currentTimeMillis) / 1000));
                            }
                        });
                    }
                    return wz.p.f75480a;
                }
            };
            this.f27393a = 1;
            if (c11.e(flowCollector, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((DescriptionItem$DescriptionViewHolder$bindView$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
