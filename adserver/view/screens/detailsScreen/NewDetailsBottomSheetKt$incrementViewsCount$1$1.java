package com.forsale.adserver.view.screens.detailsScreen;

import com.forsale.adserver.datalayer.bannerdata.ClickType;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt$incrementViewsCount$1$1", f = "NewDetailsBottomSheet.kt", l = {579, 580}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NewDetailsBottomSheetKt$incrementViewsCount$1$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21342a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AdsModel f21343b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.forsale.adserver.usecases.a f21344c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsBottomSheetKt$incrementViewsCount$1$1(AdsModel adsModel, com.forsale.adserver.usecases.a aVar, zz.a<? super NewDetailsBottomSheetKt$incrementViewsCount$1$1> aVar2) {
        super(2, aVar2);
        this.f21343b = adsModel;
        this.f21344c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewDetailsBottomSheetKt$incrementViewsCount$1$1(this.f21343b, this.f21344c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21342a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            if (this.f21343b.a() == AdType.OFFER) {
                com.forsale.adserver.usecases.a aVar = this.f21344c;
                int g11 = this.f21343b.g();
                ClickType clickType = ClickType.VIEW;
                this.f21342a = 1;
                if (aVar.e(g11, clickType, this) == f11) {
                    return f11;
                }
            } else {
                com.forsale.adserver.usecases.a aVar2 = this.f21344c;
                int g12 = this.f21343b.g();
                ClickType clickType2 = ClickType.VIEW;
                this.f21342a = 2;
                if (aVar2.c(g12, clickType2, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheetKt$incrementViewsCount$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
