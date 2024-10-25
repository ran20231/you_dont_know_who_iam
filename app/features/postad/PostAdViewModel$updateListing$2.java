package com.forsale.app.features.postad;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$updateListing$2", f = "PostAdViewModel.kt", l = {431}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$updateListing$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34182a;

    /* renamed from: b  reason: collision with root package name */
    Object f34183b;

    /* renamed from: c  reason: collision with root package name */
    int f34184c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34185d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<ListingDetailsEntity, zz.a<? super wz.p>, Object> f34186e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PostAdViewModel$updateListing$2(PostAdViewModel postAdViewModel, p<? super ListingDetailsEntity, ? super zz.a<? super wz.p>, ? extends Object> pVar, zz.a<? super PostAdViewModel$updateListing$2> aVar) {
        super(2, aVar);
        this.f34185d = postAdViewModel;
        this.f34186e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$updateListing$2(this.f34185d, this.f34186e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingDetailsEntity value;
        PostAdViewModel postAdViewModel;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34184c;
        if (i11 != 0) {
            if (i11 == 1) {
                postAdViewModel = (PostAdViewModel) this.f34183b;
                value = (ListingDetailsEntity) this.f34182a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            value = this.f34185d.p2().getValue();
            if (value != null) {
                p<ListingDetailsEntity, zz.a<? super wz.p>, Object> pVar = this.f34186e;
                PostAdViewModel postAdViewModel2 = this.f34185d;
                this.f34182a = value;
                this.f34183b = postAdViewModel2;
                this.f34184c = 1;
                if (pVar.invoke(value, this) == f11) {
                    return f11;
                }
                postAdViewModel = postAdViewModel2;
            }
            return wz.p.f75480a;
        }
        postAdViewModel.p2().postValue(value);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$updateListing$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
