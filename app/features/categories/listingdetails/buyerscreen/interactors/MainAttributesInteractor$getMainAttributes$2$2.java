package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import g00.p;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import yz.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainAttributesInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$2$2", f = "MainAttributesInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainAttributesInteractor$getMainAttributes$2$2 extends SuspendLambda implements p<List<? extends AttributesMapper.AttributesDataModel>, zz.a<? super List<? extends AttributesMapper.AttributesDataModel>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25979a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25980b;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = b.a(((AttributesMapper.AttributesDataModel) t11).d(), ((AttributesMapper.AttributesDataModel) t12).d());
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MainAttributesInteractor$getMainAttributes$2$2(zz.a<? super MainAttributesInteractor$getMainAttributes$2$2> aVar) {
        super(2, aVar);
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(List<AttributesMapper.AttributesDataModel> list, zz.a<? super List<AttributesMapper.AttributesDataModel>> aVar) {
        return ((MainAttributesInteractor$getMainAttributes$2$2) create(list, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MainAttributesInteractor$getMainAttributes$2$2 mainAttributesInteractor$getMainAttributes$2$2 = new MainAttributesInteractor$getMainAttributes$2$2(aVar);
        mainAttributesInteractor$getMainAttributes$2$2.f25980b = obj;
        return mainAttributesInteractor$getMainAttributes$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List M0;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f25979a == 0) {
            f.b(obj);
            M0 = CollectionsKt___CollectionsKt.M0((List) this.f25980b, new a());
            return M0;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
