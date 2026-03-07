package com.gse.aulapp.util;

import android.content.Context;
import android.media.RingtoneManager;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.util.Log;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.dto.TagDto;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/gse/aulapp/model/dto/TagDto;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.NfcUtil$Companion$handlerResponseTag$2", f = "NfcUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNfcUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NfcUtil.kt\ncom/gse/aulapp/util/NfcUtil$Companion$handlerResponseTag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
/* loaded from: classes.dex */
public final class NfcUtil$Companion$handlerResponseTag$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TagDto>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Tag $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcUtil$Companion$handlerResponseTag$2(Tag tag, Context context, Continuation continuation) {
        super(2, continuation);
        this.$tag = tag;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$0(byte b) {
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new NfcUtil$Companion$handlerResponseTag$2(this.$tag, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tag tag = this.$tag;
        if (tag != null) {
            byte[] id = tag.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            if (id.length != 0) {
                byte[] id2 = this.$tag.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                String joinedString = ArraysKt.joinToString(id2, (CharSequence) ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new b(), 30, (Object) null);
                String t = joinedString.replace(":", BuildConfig.FLAVOR);
                String unused = NfcUtil.TAG;
                LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                companion2.setLog(this.$context, q.i("handlerResponseTag: Tag serial ", t), null, false);
                Ndef ndef = Ndef.get(this.$tag);
                if (ndef == null) {
                    companion2.setLog(this.$context, "handlerResponseTag: Not an Ndef capable card", "handlerResponseTag", true);
                    Boxing.boxInt(Log.d(NfcUtil.TAG, "Not an Ndef capable card"));
                    return null;
                }
                TagDto result = null;
                try {
                    String payloadByTag = NfcUtil.INSTANCE.getPayloadByTag(ndef);
                    String unused3 = NfcUtil.TAG;
                    try {
                        companion2.setLog(this.$context, "handlerResponseTag: Ndef Message: " + payloadByTag, null, false);
                        try {
                            RingtoneManager.getRingtone(this.$context, RingtoneManager.getDefaultUri(2)).play();
                        } catch (Exception e) {
                            LogSendUtil.INSTANCE.setLog(this.$context, "handlerResponseTag:Error playing sound:  " + e.getMessage() + " ", "handlerResponseTag", true);
                            Boxing.boxInt(Log.d(NfcUtil.TAG, "Error playing sound: " + e));
                        }
                        if (payloadByTag != null) {
                            result = new TagDto(payloadByTag, t);
                        }
                    } catch (Exception e) {
                        LogSendUtil.INSTANCE.setLog(this.$context, "handlerResponseTag:Error playing sound:  " + e.getMessage() + " ", "handlerResponseTag", true);
                        Boxing.boxInt(Log.d(NfcUtil.TAG, "Error playing sound: " + e));
                    }
                } catch (Exception e) {
                    LogSendUtil.INSTANCE.setLog(this.$context, "handlerResponseTag:Error playing sound:  " + e.getMessage() + " ", "handlerResponseTag", true);
                    Boxing.boxInt(Log.d(NfcUtil.TAG, "Error playing sound: " + e));
                } finally {
                    try {
                        ndef.close();
                    } catch (IOException e) {
                        LogSendUtil.INSTANCE.setLog(this.$context, defpackage.a.m("handlerResponseTag: Error closing NFC: ", e.getMessage(), " "), "handlerResponseTag", true);
                        String unused4 = NfcUtil.TAG;
                        e.toString();
                    }
                }
                return result;
            }
        }
        LogSendUtil.INSTANCE.setLog(this.$context, "handlerResponseTag: Tag is null or id is null", null, false);
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TagDto> continuation) {
        return ((NfcUtil$Companion$handlerResponseTag$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
