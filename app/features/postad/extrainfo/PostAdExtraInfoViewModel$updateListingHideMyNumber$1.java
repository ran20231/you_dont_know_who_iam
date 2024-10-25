package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$updateListingHideMyNumber$1", f = "PostAdExtraInfoViewModel.kt", l = {287}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$updateListingHideMyNumber$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35561a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35562b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$updateListingHideMyNumber$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$updateListingHideMyNumber$1> aVar) {
        super(2, aVar);
        this.f35562b = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$updateListingHideMyNumber$1(this.f35562b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35561a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ListingDetailsEntity n22 = this.f35562b.o1().n2();
            if (n22 != null) {
                PostAdExtraInfoViewModel postAdExtraInfoViewModel = this.f35562b;
                n22.setHideMyNumber(TypeExtensionsKt.H0(postAdExtraInfoViewModel.C1().j()));
                postAdExtraInfoViewModel.o1().L4(n22);
                PostAdViewModel o12 = postAdExtraInfoViewModel.o1();
                boolean j11 = postAdExtraInfoViewModel.C1().j();
                this.f35561a = 1;
                if (o12.x4(j11, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$updateListingHideMyNumber$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
