package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import g00.l;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.InAppRepository$saveInAppMessagesData$2", f = "InAppRepository.kt", l = {117, 119}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InAppRepository$saveInAppMessagesData$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {
    final /* synthetic */ List<InAppMessageEntity> $inAppMessages;
    Object L$0;
    int label;
    final /* synthetic */ InAppRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$saveInAppMessagesData$2(List<InAppMessageEntity> list, InAppRepository inAppRepository, zz.a<? super InAppRepository$saveInAppMessagesData$2> aVar) {
        super(1, aVar);
        this.$inAppMessages = list;
        this.this$0 = inAppRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new InAppRepository$saveInAppMessagesData$2(this.$inAppMessages, this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        InAppRepository inAppRepository;
        Object saveInAppMessages;
        Object deleteExpiredInAppMessages;
        InAppRepository inAppRepository2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    inAppRepository2 = (InAppRepository) this.L$0;
                    f.b(obj);
                    inAppRepository2.saveInAppMessageReset(0);
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppRepository = (InAppRepository) this.L$0;
            f.b(obj);
        } else {
            f.b(obj);
            List<InAppMessageEntity> list = this.$inAppMessages;
            inAppRepository = this.this$0;
            if (!list.isEmpty()) {
                this.L$0 = inAppRepository;
                this.label = 1;
                saveInAppMessages = inAppRepository.saveInAppMessages(list, this);
                if (saveInAppMessages == f11) {
                    return f11;
                }
            }
        }
        this.L$0 = inAppRepository;
        this.label = 2;
        deleteExpiredInAppMessages = inAppRepository.deleteExpiredInAppMessages(this);
        if (deleteExpiredInAppMessages == f11) {
            return f11;
        }
        inAppRepository2 = inAppRepository;
        inAppRepository2.saveInAppMessageReset(0);
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((InAppRepository$saveInAppMessagesData$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
