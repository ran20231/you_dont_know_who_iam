package com.forsale.app.features.categories.listingdetails;

import android.content.DialogInterface;
import com.forsale.app.utils.GenericDialogParameters;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2", f = "ListingDetailsViewModel.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25367a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25368b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2(ListingDetailsViewModel listingDetailsViewModel, zz.a<? super ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2> aVar) {
        super(2, aVar);
        this.f25368b = listingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2(this.f25368b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25367a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableSharedFlow<GenericDialogParameters> X = this.f25368b.X();
            GenericDialogParameters genericDialogParameters = new GenericDialogParameters(null, y0.N0, kotlin.coroutines.jvm.internal.a.d(y0.Z4), null, new l<DialogInterface, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2.1
                public final void b(DialogInterface it2) {
                    o.i(it2, "it");
                    it2.dismiss();
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(DialogInterface dialogInterface) {
                    b(dialogInterface);
                    return wz.p.f75480a;
                }
            }, null, 33, null);
            this.f25367a = 1;
            if (X.emit(genericDialogParameters, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
