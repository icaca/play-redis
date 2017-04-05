package play.modules.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * Redis connector for the Play framework.
 *
 * **DO NOT EDIT**.  This class was auto-generated.
 * See play.modules.redis.generator.RedisGenerator.
 *
 * @author Tim Kral
 **/
public class Redis {


    public static java.lang.Long append(java.lang.String key,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.append(key,value);
    }
    
    public static java.lang.Long append(byte[] key,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.append(key,value);
    }
    
    public static java.lang.String asking() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.asking();
        } else {
            throw new JedisConnectionException("Cannot execute asking with sharded instance.");
        }
    }
    
    public static java.lang.String auth(java.lang.String password) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.auth(password);
        } else {
            throw new JedisConnectionException("Cannot execute auth with sharded instance.");
        }
    }
    
    public static java.lang.String bgrewriteaof() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bgrewriteaof();
        } else {
            throw new JedisConnectionException("Cannot execute bgrewriteaof with sharded instance.");
        }
    }
    
    public static java.lang.String bgsave() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bgsave();
        } else {
            throw new JedisConnectionException("Cannot execute bgsave with sharded instance.");
        }
    }
    
    public static java.lang.Long bitcount(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.bitcount(key);
    }
    
    public static java.lang.Long bitcount(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.bitcount(key);
    }
    
    public static java.lang.Long bitcount(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.bitcount(key,start,end);
    }
    
    public static java.lang.Long bitcount(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.bitcount(key,start,end);
    }
    
    public static java.lang.Long bitop(redis.clients.jedis.BitOP op,byte[] destKey,byte[][] srcKeys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitop(op,destKey,srcKeys);
        } else {
            throw new JedisConnectionException("Cannot execute bitop with sharded instance.");
        }
    }
    
    public static java.lang.Long bitop(redis.clients.jedis.BitOP op,java.lang.String destKey,java.lang.String[] srcKeys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.bitop(op,destKey,srcKeys);
        } else {
            throw new JedisConnectionException("Cannot execute bitop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(java.lang.String[] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(args);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(byte[][] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(args);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(java.lang.String arg) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(arg);
        return jedis.blpop(arg);
    }
    
    public static java.util.List blpop(byte[] arg) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(arg);
        return jedis.blpop(arg);
    }
    
    public static java.util.List blpop(int timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List blpop(int timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.blpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute blpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(byte[] arg) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(arg);
        return jedis.brpop(arg);
    }
    
    public static java.util.List brpop(java.lang.String arg) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(arg);
        return jedis.brpop(arg);
    }
    
    public static java.util.List brpop(java.lang.String[] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(args);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(byte[][] args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(args);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(int timeout,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static java.util.List brpop(int timeout,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpop(timeout,keys);
        } else {
            throw new JedisConnectionException("Cannot execute brpop with sharded instance.");
        }
    }
    
    public static byte[] brpoplpush(byte[] source,byte[] destination,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpoplpush(source,destination,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute brpoplpush with sharded instance.");
        }
    }
    
    public static java.lang.String brpoplpush(java.lang.String source,java.lang.String destination,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.brpoplpush(source,destination,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute brpoplpush with sharded instance.");
        }
    }
    
    public static java.lang.String clientGetname() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientGetname();
        } else {
            throw new JedisConnectionException("Cannot execute clientGetname with sharded instance.");
        }
    }
    
    public static java.lang.String clientKill(byte[] client) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientKill(client);
        } else {
            throw new JedisConnectionException("Cannot execute clientKill with sharded instance.");
        }
    }
    
    public static java.lang.String clientKill(java.lang.String client) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientKill(client);
        } else {
            throw new JedisConnectionException("Cannot execute clientKill with sharded instance.");
        }
    }
    
    public static java.lang.String clientList() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientList();
        } else {
            throw new JedisConnectionException("Cannot execute clientList with sharded instance.");
        }
    }
    
    public static java.lang.String clientSetname(byte[] name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientSetname(name);
        } else {
            throw new JedisConnectionException("Cannot execute clientSetname with sharded instance.");
        }
    }
    
    public static java.lang.String clientSetname(java.lang.String name) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clientSetname(name);
        } else {
            throw new JedisConnectionException("Cannot execute clientSetname with sharded instance.");
        }
    }
    
    public static void close() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.close();
        } else {
            throw new JedisConnectionException("Cannot execute close with sharded instance.");
        }
    }
    
    public static java.lang.String clusterAddSlots(int[] slots) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterAddSlots(slots);
        } else {
            throw new JedisConnectionException("Cannot execute clusterAddSlots with sharded instance.");
        }
    }
    
    public static java.lang.String clusterDelSlots(int[] slots) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterDelSlots(slots);
        } else {
            throw new JedisConnectionException("Cannot execute clusterDelSlots with sharded instance.");
        }
    }
    
    public static java.util.List clusterGetKeysInSlot(int slot,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterGetKeysInSlot(slot,count);
        } else {
            throw new JedisConnectionException("Cannot execute clusterGetKeysInSlot with sharded instance.");
        }
    }
    
    public static java.lang.String clusterInfo() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterInfo();
        } else {
            throw new JedisConnectionException("Cannot execute clusterInfo with sharded instance.");
        }
    }
    
    public static java.lang.String clusterMeet(java.lang.String ip,int port) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterMeet(ip,port);
        } else {
            throw new JedisConnectionException("Cannot execute clusterMeet with sharded instance.");
        }
    }
    
    public static java.lang.String clusterNodes() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterNodes();
        } else {
            throw new JedisConnectionException("Cannot execute clusterNodes with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetSlotImporting(int slot,java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetSlotImporting(slot,nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetSlotImporting with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetSlotMigrating(int slot,java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetSlotMigrating(slot,nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetSlotMigrating with sharded instance.");
        }
    }
    
    public static java.lang.String clusterSetSlotNode(int slot,java.lang.String nodeId) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.clusterSetSlotNode(slot,nodeId);
        } else {
            throw new JedisConnectionException("Cannot execute clusterSetSlotNode with sharded instance.");
        }
    }
    
    public static java.util.List configGet(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configGet(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute configGet with sharded instance.");
        }
    }
    
    public static java.util.List configGet(byte[] pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configGet(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute configGet with sharded instance.");
        }
    }
    
    public static java.lang.String configResetStat() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configResetStat();
        } else {
            throw new JedisConnectionException("Cannot execute configResetStat with sharded instance.");
        }
    }
    
    public static byte[] configSet(byte[] parameter,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configSet(parameter,value);
        } else {
            throw new JedisConnectionException("Cannot execute configSet with sharded instance.");
        }
    }
    
    public static java.lang.String configSet(java.lang.String parameter,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.configSet(parameter,value);
        } else {
            throw new JedisConnectionException("Cannot execute configSet with sharded instance.");
        }
    }
    
    public static void connect() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.connect();
        } else {
            throw new JedisConnectionException("Cannot execute connect with sharded instance.");
        }
    }
    
    public static java.lang.Long dbSize() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.dbSize();
        } else {
            throw new JedisConnectionException("Cannot execute dbSize with sharded instance.");
        }
    }
    
    public static java.lang.String debug(redis.clients.jedis.DebugParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.debug(params);
        } else {
            throw new JedisConnectionException("Cannot execute debug with sharded instance.");
        }
    }
    
    public static java.lang.Long decr(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.decr(key);
    }
    
    public static java.lang.Long decr(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.decr(key);
    }
    
    public static java.lang.Long decrBy(byte[] key,long integer) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.decrBy(key,integer);
    }
    
    public static java.lang.Long decrBy(java.lang.String key,long integer) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.decrBy(key,integer);
    }
    
    public static java.lang.Long del(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.del(key);
    }
    
    public static java.lang.Long del(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.del(keys);
        } else {
            throw new JedisConnectionException("Cannot execute del with sharded instance.");
        }
    }
    
    public static java.lang.Long del(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.del(key);
    }
    
    public static java.lang.Long del(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.del(keys);
        } else {
            throw new JedisConnectionException("Cannot execute del with sharded instance.");
        }
    }
    
    public static byte[] dump(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.dump(key);
        } else {
            throw new JedisConnectionException("Cannot execute dump with sharded instance.");
        }
    }
    
    public static byte[] dump(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.dump(key);
        } else {
            throw new JedisConnectionException("Cannot execute dump with sharded instance.");
        }
    }
    
    public static byte[] echo(byte[] string) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(string);
        return jedis.echo(string);
    }
    
    public static java.lang.String echo(java.lang.String string) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(string);
        return jedis.echo(string);
    }
    
    public static java.lang.Object eval(java.lang.String script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(byte[] script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(byte[] script,byte[] keyCount,byte[][] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(java.lang.String script,int keyCount,java.lang.String[] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(java.lang.String script,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(byte[] script,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object eval(byte[] script,int keyCount,byte[][] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.eval(script,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute eval with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(byte[] sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(java.lang.String script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(script);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(byte[] sha1,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(java.lang.String sha1,java.util.List keys,java.util.List args) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keys,args);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(byte[] sha1,int keyCount,byte[][] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Object evalsha(java.lang.String sha1,int keyCount,java.lang.String[] params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.evalsha(sha1,keyCount,params);
        } else {
            throw new JedisConnectionException("Cannot execute evalsha with sharded instance.");
        }
    }
    
    public static java.lang.Boolean exists(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.exists(key);
    }
    
    public static java.lang.Boolean exists(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.exists(key);
    }
    
    public static java.lang.Long expire(java.lang.String key,int seconds) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.expire(key,seconds);
    }
    
    public static java.lang.Long expire(byte[] key,int seconds) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.expire(key,seconds);
    }
    
    public static java.lang.Long expireAt(byte[] key,long unixTime) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.expireAt(key,unixTime);
    }
    
    public static java.lang.Long expireAt(java.lang.String key,long unixTime) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.expireAt(key,unixTime);
    }
    
    public static java.lang.String flushAll() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.flushAll();
        } else {
            throw new JedisConnectionException("Cannot execute flushAll with sharded instance.");
        }
    }
    
    public static java.lang.String flushDB() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.flushDB();
        } else {
            throw new JedisConnectionException("Cannot execute flushDB with sharded instance.");
        }
    }
    
    public static java.lang.String get(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.get(key);
    }
    
    public static byte[] get(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.get(key);
    }
    
    public static redis.clients.jedis.Client getClient() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getClient();
        } else {
            throw new JedisConnectionException("Cannot execute getClient with sharded instance.");
        }
    }
    
    public static java.lang.Long getDB() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.getDB();
        } else {
            throw new JedisConnectionException("Cannot execute getDB with sharded instance.");
        }
    }
    
    public static java.lang.String getSet(java.lang.String key,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.getSet(key,value);
    }
    
    public static byte[] getSet(byte[] key,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.getSet(key,value);
    }
    
    public static java.lang.Boolean getbit(byte[] key,long offset) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.getbit(key,offset);
    }
    
    public static java.lang.Boolean getbit(java.lang.String key,long offset) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.getbit(key,offset);
    }
    
    public static java.lang.String getrange(java.lang.String key,long startOffset,long endOffset) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.getrange(key,startOffset,endOffset);
    }
    
    public static byte[] getrange(byte[] key,long startOffset,long endOffset) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.getrange(key,startOffset,endOffset);
    }
    
    public static java.lang.Long hdel(java.lang.String key,java.lang.String[] fields) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hdel(key,fields);
    }
    
    public static java.lang.Long hdel(byte[] key,byte[][] fields) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hdel(key,fields);
    }
    
    public static java.lang.Boolean hexists(byte[] key,byte[] field) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hexists(key,field);
    }
    
    public static java.lang.Boolean hexists(java.lang.String key,java.lang.String field) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hexists(key,field);
    }
    
    public static byte[] hget(byte[] key,byte[] field) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hget(key,field);
    }
    
    public static java.lang.String hget(java.lang.String key,java.lang.String field) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hget(key,field);
    }
    
    public static java.util.Map hgetAll(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hgetAll(key);
    }
    
    public static java.util.Map hgetAll(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hgetAll(key);
    }
    
    public static java.lang.Long hincrBy(byte[] key,byte[] field,long value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hincrBy(key,field,value);
    }
    
    public static java.lang.Long hincrBy(java.lang.String key,java.lang.String field,long value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hincrBy(key,field,value);
    }
    
    public static java.lang.Double hincrByFloat(java.lang.String key,java.lang.String field,double increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hincrByFloat(key,field,increment);
        } else {
            throw new JedisConnectionException("Cannot execute hincrByFloat with sharded instance.");
        }
    }
    
    public static java.lang.Double hincrByFloat(byte[] key,byte[] field,double increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hincrByFloat(key,field,increment);
        } else {
            throw new JedisConnectionException("Cannot execute hincrByFloat with sharded instance.");
        }
    }
    
    public static java.util.Set hkeys(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hkeys(key);
    }
    
    public static java.util.Set hkeys(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hkeys(key);
    }
    
    public static java.lang.Long hlen(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hlen(key);
    }
    
    public static java.lang.Long hlen(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hlen(key);
    }
    
    public static java.util.List hmget(java.lang.String key,java.lang.String[] fields) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hmget(key,fields);
    }
    
    public static java.util.List hmget(byte[] key,byte[][] fields) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hmget(key,fields);
    }
    
    public static java.lang.String hmset(byte[] key,java.util.Map hash) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hmset(key,hash);
    }
    
    public static java.lang.String hmset(java.lang.String key,java.util.Map hash) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hmset(key,hash);
    }
    
    public static redis.clients.jedis.ScanResult hscan(java.lang.String key,int cursor) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hscan(key,cursor);
    }
    
    public static redis.clients.jedis.ScanResult hscan(java.lang.String key,java.lang.String cursor) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hscan(key,cursor);
    }
    
    public static redis.clients.jedis.ScanResult hscan(java.lang.String key,java.lang.String cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute hscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.ScanResult hscan(java.lang.String key,int cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.hscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute hscan with sharded instance.");
        }
    }
    
    public static java.lang.Long hset(java.lang.String key,java.lang.String field,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hset(key,field,value);
    }
    
    public static java.lang.Long hset(byte[] key,byte[] field,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hset(key,field,value);
    }
    
    public static java.lang.Long hsetnx(byte[] key,byte[] field,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hsetnx(key,field,value);
    }
    
    public static java.lang.Long hsetnx(java.lang.String key,java.lang.String field,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hsetnx(key,field,value);
    }
    
    public static java.util.List hvals(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.hvals(key);
    }
    
    public static java.util.Collection hvals(byte[] x0) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(x0);
        return jedis.hvals(x0);
    }
    
    public static java.lang.Long incr(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.incr(key);
    }
    
    public static java.lang.Long incr(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.incr(key);
    }
    
    public static java.lang.Long incrBy(java.lang.String key,long integer) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.incrBy(key,integer);
    }
    
    public static java.lang.Long incrBy(byte[] key,long integer) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.incrBy(key,integer);
    }
    
    public static java.lang.Double incrByFloat(byte[] key,double increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incrByFloat(key,increment);
        } else {
            throw new JedisConnectionException("Cannot execute incrByFloat with sharded instance.");
        }
    }
    
    public static java.lang.Double incrByFloat(java.lang.String key,double increment) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.incrByFloat(key,increment);
        } else {
            throw new JedisConnectionException("Cannot execute incrByFloat with sharded instance.");
        }
    }
    
    public static java.lang.String info() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.info();
        } else {
            throw new JedisConnectionException("Cannot execute info with sharded instance.");
        }
    }
    
    public static java.lang.String info(java.lang.String section) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.info(section);
        } else {
            throw new JedisConnectionException("Cannot execute info with sharded instance.");
        }
    }
    
    public static boolean isConnected() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.isConnected();
        } else {
            throw new JedisConnectionException("Cannot execute isConnected with sharded instance.");
        }
    }
    
    public static java.util.Set keys(byte[] pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.keys(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute keys with sharded instance.");
        }
    }
    
    public static java.util.Set keys(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.keys(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute keys with sharded instance.");
        }
    }
    
    public static java.lang.Long lastsave() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.lastsave();
        } else {
            throw new JedisConnectionException("Cannot execute lastsave with sharded instance.");
        }
    }
    
    public static java.lang.String lindex(java.lang.String key,long index) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lindex(key,index);
    }
    
    public static byte[] lindex(byte[] key,long index) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lindex(key,index);
    }
    
    public static java.lang.Long linsert(byte[] key,redis.clients.jedis.BinaryClient.LIST_POSITION where,byte[] pivot,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.linsert(key,where,pivot,value);
    }
    
    public static java.lang.Long linsert(java.lang.String key,redis.clients.jedis.BinaryClient.LIST_POSITION where,java.lang.String pivot,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.linsert(key,where,pivot,value);
    }
    
    public static java.lang.Long llen(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.llen(key);
    }
    
    public static java.lang.Long llen(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.llen(key);
    }
    
    public static java.lang.String lpop(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lpop(key);
    }
    
    public static byte[] lpop(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lpop(key);
    }
    
    public static java.lang.Long lpush(byte[] key,byte[][] strings) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lpush(key,strings);
    }
    
    public static java.lang.Long lpush(java.lang.String key,java.lang.String[] strings) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lpush(key,strings);
    }
    
    public static java.lang.Long lpushx(byte[] key,byte[][] string) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lpushx(key,string);
    }
    
    public static java.lang.Long lpushx(java.lang.String key,java.lang.String[] string) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lpushx(key,string);
    }
    
    public static java.util.List lrange(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lrange(key,start,end);
    }
    
    public static java.util.List lrange(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lrange(key,start,end);
    }
    
    public static java.lang.Long lrem(java.lang.String key,long count,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lrem(key,count,value);
    }
    
    public static java.lang.Long lrem(byte[] key,long count,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lrem(key,count,value);
    }
    
    public static java.lang.String lset(byte[] key,long index,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lset(key,index,value);
    }
    
    public static java.lang.String lset(java.lang.String key,long index,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.lset(key,index,value);
    }
    
    public static java.lang.String ltrim(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.ltrim(key,start,end);
    }
    
    public static java.lang.String ltrim(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.ltrim(key,start,end);
    }
    
    public static java.util.List mget(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mget(keys);
        } else {
            throw new JedisConnectionException("Cannot execute mget with sharded instance.");
        }
    }
    
    public static java.util.List mget(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mget(keys);
        } else {
            throw new JedisConnectionException("Cannot execute mget with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(byte[] host,int port,byte[] key,int destinationDb,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,key,destinationDb,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static java.lang.String migrate(java.lang.String host,int port,java.lang.String key,int destinationDb,int timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.migrate(host,port,key,destinationDb,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute migrate with sharded instance.");
        }
    }
    
    public static void monitor(redis.clients.jedis.JedisMonitor jedisMonitor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.monitor(jedisMonitor);
        } else {
            throw new JedisConnectionException("Cannot execute monitor with sharded instance.");
        }
    }
    
    public static java.lang.Long move(byte[] key,int dbIndex) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.move(key,dbIndex);
    }
    
    public static java.lang.Long move(java.lang.String key,int dbIndex) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.move(key,dbIndex);
    }
    
    public static java.lang.String mset(byte[][] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mset(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute mset with sharded instance.");
        }
    }
    
    public static java.lang.String mset(java.lang.String[] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.mset(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute mset with sharded instance.");
        }
    }
    
    public static java.lang.Long msetnx(byte[][] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.msetnx(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute msetnx with sharded instance.");
        }
    }
    
    public static java.lang.Long msetnx(java.lang.String[] keysvalues) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.msetnx(keysvalues);
        } else {
            throw new JedisConnectionException("Cannot execute msetnx with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.Transaction multi() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.multi();
        } else {
            throw new JedisConnectionException("Cannot execute multi with sharded instance.");
        }
    }
    
    public static java.util.List multi(redis.clients.jedis.TransactionBlock jedisTransaction) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.multi(jedisTransaction);
        } else {
            throw new JedisConnectionException("Cannot execute multi with sharded instance.");
        }
    }
    
    public static java.lang.String objectEncoding(java.lang.String string) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectEncoding(string);
        } else {
            throw new JedisConnectionException("Cannot execute objectEncoding with sharded instance.");
        }
    }
    
    public static byte[] objectEncoding(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.objectEncoding(key);
    }
    
    public static java.lang.Long objectIdletime(java.lang.String string) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectIdletime(string);
        } else {
            throw new JedisConnectionException("Cannot execute objectIdletime with sharded instance.");
        }
    }
    
    public static java.lang.Long objectIdletime(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.objectIdletime(key);
    }
    
    public static java.lang.Long objectRefcount(java.lang.String string) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.objectRefcount(string);
        } else {
            throw new JedisConnectionException("Cannot execute objectRefcount with sharded instance.");
        }
    }
    
    public static java.lang.Long objectRefcount(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.objectRefcount(key);
    }
    
    public static java.lang.Long persist(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.persist(key);
    }
    
    public static java.lang.Long persist(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.persist(key);
    }
    
    public static java.lang.Long pexpire(java.lang.String key,int milliseconds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpire(key,milliseconds);
        } else {
            throw new JedisConnectionException("Cannot execute pexpire with sharded instance.");
        }
    }
    
    public static java.lang.Long pexpire(byte[] key,int milliseconds) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpire(key,milliseconds);
        } else {
            throw new JedisConnectionException("Cannot execute pexpire with sharded instance.");
        }
    }
    
    public static java.lang.Long pexpireAt(byte[] key,long millisecondsTimestamp) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireAt(key,millisecondsTimestamp);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireAt with sharded instance.");
        }
    }
    
    public static java.lang.Long pexpireAt(java.lang.String key,long millisecondsTimestamp) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pexpireAt(key,millisecondsTimestamp);
        } else {
            throw new JedisConnectionException("Cannot execute pexpireAt with sharded instance.");
        }
    }
    
    public static java.lang.String ping() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.ping();
        } else {
            throw new JedisConnectionException("Cannot execute ping with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.Pipeline pipelined() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pipelined();
        } else {
            throw new JedisConnectionException("Cannot execute pipelined with sharded instance.");
        }
    }
    
    public static java.util.List pipelined(redis.clients.jedis.PipelineBlock jedisPipeline) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pipelined(jedisPipeline);
        } else {
            throw new JedisConnectionException("Cannot execute pipelined with sharded instance.");
        }
    }
    
    public static java.lang.String psetex(byte[] key,int milliseconds,byte[] value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.psetex(key,milliseconds,value);
        } else {
            throw new JedisConnectionException("Cannot execute psetex with sharded instance.");
        }
    }
    
    public static java.lang.String psetex(java.lang.String key,int milliseconds,java.lang.String value) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.psetex(key,milliseconds,value);
        } else {
            throw new JedisConnectionException("Cannot execute psetex with sharded instance.");
        }
    }
    
    public static void psubscribe(redis.clients.jedis.BinaryJedisPubSub jedisPubSub,byte[][] patterns) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.psubscribe(jedisPubSub,patterns);
        } else {
            throw new JedisConnectionException("Cannot execute psubscribe with sharded instance.");
        }
    }
    
    public static void psubscribe(redis.clients.jedis.JedisPubSub jedisPubSub,java.lang.String[] patterns) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.psubscribe(jedisPubSub,patterns);
        } else {
            throw new JedisConnectionException("Cannot execute psubscribe with sharded instance.");
        }
    }
    
    public static java.lang.Long pttl(java.lang.String key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pttl(key);
        } else {
            throw new JedisConnectionException("Cannot execute pttl with sharded instance.");
        }
    }
    
    public static java.lang.Long pttl(byte[] key) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pttl(key);
        } else {
            throw new JedisConnectionException("Cannot execute pttl with sharded instance.");
        }
    }
    
    public static java.lang.Long publish(byte[] channel,byte[] message) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.publish(channel,message);
        } else {
            throw new JedisConnectionException("Cannot execute publish with sharded instance.");
        }
    }
    
    public static java.lang.Long publish(java.lang.String channel,java.lang.String message) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.publish(channel,message);
        } else {
            throw new JedisConnectionException("Cannot execute publish with sharded instance.");
        }
    }
    
    public static java.util.List pubsubChannels(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pubsubChannels(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute pubsubChannels with sharded instance.");
        }
    }
    
    public static java.lang.Long pubsubNumPat() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pubsubNumPat();
        } else {
            throw new JedisConnectionException("Cannot execute pubsubNumPat with sharded instance.");
        }
    }
    
    public static java.util.Map pubsubNumSub(java.lang.String[] channels) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.pubsubNumSub(channels);
        } else {
            throw new JedisConnectionException("Cannot execute pubsubNumSub with sharded instance.");
        }
    }
    
    public static byte[] randomBinaryKey() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.randomBinaryKey();
        } else {
            throw new JedisConnectionException("Cannot execute randomBinaryKey with sharded instance.");
        }
    }
    
    public static java.lang.String randomKey() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.randomKey();
        } else {
            throw new JedisConnectionException("Cannot execute randomKey with sharded instance.");
        }
    }
    
    public static java.lang.String rename(byte[] oldkey,byte[] newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rename(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute rename with sharded instance.");
        }
    }
    
    public static java.lang.String rename(java.lang.String oldkey,java.lang.String newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rename(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute rename with sharded instance.");
        }
    }
    
    public static java.lang.Long renamenx(byte[] oldkey,byte[] newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.renamenx(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute renamenx with sharded instance.");
        }
    }
    
    public static java.lang.Long renamenx(java.lang.String oldkey,java.lang.String newkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.renamenx(oldkey,newkey);
        } else {
            throw new JedisConnectionException("Cannot execute renamenx with sharded instance.");
        }
    }
    
    public static void resetState() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.resetState();
        } else {
            throw new JedisConnectionException("Cannot execute resetState with sharded instance.");
        }
    }
    
    public static java.lang.String restore(byte[] key,int ttl,byte[] serializedValue) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.restore(key,ttl,serializedValue);
        } else {
            throw new JedisConnectionException("Cannot execute restore with sharded instance.");
        }
    }
    
    public static java.lang.String restore(java.lang.String key,int ttl,byte[] serializedValue) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.restore(key,ttl,serializedValue);
        } else {
            throw new JedisConnectionException("Cannot execute restore with sharded instance.");
        }
    }
    
    public static byte[] rpop(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.rpop(key);
    }
    
    public static java.lang.String rpop(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.rpop(key);
    }
    
    public static java.lang.String rpoplpush(java.lang.String srckey,java.lang.String dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpoplpush(srckey,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute rpoplpush with sharded instance.");
        }
    }
    
    public static byte[] rpoplpush(byte[] srckey,byte[] dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.rpoplpush(srckey,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute rpoplpush with sharded instance.");
        }
    }
    
    public static java.lang.Long rpush(byte[] key,byte[][] strings) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.rpush(key,strings);
    }
    
    public static java.lang.Long rpush(java.lang.String key,java.lang.String[] strings) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.rpush(key,strings);
    }
    
    public static java.lang.Long rpushx(java.lang.String key,java.lang.String[] string) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.rpushx(key,string);
    }
    
    public static java.lang.Long rpushx(byte[] key,byte[][] string) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.rpushx(key,string);
    }
    
    public static java.lang.Long sadd(java.lang.String key,java.lang.String[] members) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sadd(key,members);
    }
    
    public static java.lang.Long sadd(byte[] key,byte[][] members) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sadd(key,members);
    }
    
    public static java.lang.String save() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.save();
        } else {
            throw new JedisConnectionException("Cannot execute save with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.ScanResult scan(java.lang.String cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.ScanResult scan(int cursor) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.ScanResult scan(int cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.ScanResult scan(java.lang.String cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scan(cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute scan with sharded instance.");
        }
    }
    
    public static java.lang.Long scard(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.scard(key);
    }
    
    public static java.lang.Long scard(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.scard(key);
    }
    
    public static java.lang.Boolean scriptExists(java.lang.String sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptExists(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute scriptExists with sharded instance.");
        }
    }
    
    public static java.util.List scriptExists(byte[][] sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptExists(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute scriptExists with sharded instance.");
        }
    }
    
    public static java.util.List scriptExists(java.lang.String[] sha1) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptExists(sha1);
        } else {
            throw new JedisConnectionException("Cannot execute scriptExists with sharded instance.");
        }
    }
    
    public static java.lang.String scriptFlush() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptFlush();
        } else {
            throw new JedisConnectionException("Cannot execute scriptFlush with sharded instance.");
        }
    }
    
    public static java.lang.String scriptKill() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptKill();
        } else {
            throw new JedisConnectionException("Cannot execute scriptKill with sharded instance.");
        }
    }
    
    public static java.lang.String scriptLoad(java.lang.String script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptLoad(script);
        } else {
            throw new JedisConnectionException("Cannot execute scriptLoad with sharded instance.");
        }
    }
    
    public static byte[] scriptLoad(byte[] script) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.scriptLoad(script);
        } else {
            throw new JedisConnectionException("Cannot execute scriptLoad with sharded instance.");
        }
    }
    
    public static java.util.Set sdiff(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiff(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiff with sharded instance.");
        }
    }
    
    public static java.util.Set sdiff(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiff(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiff with sharded instance.");
        }
    }
    
    public static java.lang.Long sdiffstore(java.lang.String dstkey,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiffstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiffstore with sharded instance.");
        }
    }
    
    public static java.lang.Long sdiffstore(byte[] dstkey,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sdiffstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sdiffstore with sharded instance.");
        }
    }
    
    public static java.lang.String select(int index) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.select(index);
        } else {
            throw new JedisConnectionException("Cannot execute select with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelFailover(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelFailover(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelFailover with sharded instance.");
        }
    }
    
    public static java.util.List sentinelGetMasterAddrByName(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelGetMasterAddrByName(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelGetMasterAddrByName with sharded instance.");
        }
    }
    
    public static java.util.List sentinelMasters() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelMasters();
        } else {
            throw new JedisConnectionException("Cannot execute sentinelMasters with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelMonitor(java.lang.String masterName,java.lang.String ip,int port,int quorum) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelMonitor(masterName,ip,port,quorum);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelMonitor with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelRemove(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelRemove(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelRemove with sharded instance.");
        }
    }
    
    public static java.lang.Long sentinelReset(java.lang.String pattern) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelReset(pattern);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelReset with sharded instance.");
        }
    }
    
    public static java.lang.String sentinelSet(java.lang.String masterName,java.util.Map parameterMap) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelSet(masterName,parameterMap);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelSet with sharded instance.");
        }
    }
    
    public static java.util.List sentinelSlaves(java.lang.String masterName) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sentinelSlaves(masterName);
        } else {
            throw new JedisConnectionException("Cannot execute sentinelSlaves with sharded instance.");
        }
    }
    
    public static java.lang.String set(byte[] key,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.set(key,value);
    }
    
    public static java.lang.String set(java.lang.String key,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.set(key,value);
    }
    
    public static java.lang.String set(java.lang.String key,java.lang.String value,java.lang.String nxxx) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,nxxx);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(byte[] key,byte[] value,byte[] nxxx) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,nxxx);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(java.lang.String key,java.lang.String value,java.lang.String nxxx,java.lang.String expx,int time) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,nxxx,expx,time);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(java.lang.String key,java.lang.String value,java.lang.String nxxx,java.lang.String expx,long time) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,nxxx,expx,time);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(byte[] key,byte[] value,byte[] nxxx,byte[] expx,long time) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,nxxx,expx,time);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.String set(byte[] key,byte[] value,byte[] nxxx,byte[] expx,int time) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.set(key,value,nxxx,expx,time);
        } else {
            throw new JedisConnectionException("Cannot execute set with sharded instance.");
        }
    }
    
    public static java.lang.Boolean setbit(java.lang.String key,long offset,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setbit(key,offset,value);
    }
    
    public static java.lang.Boolean setbit(byte[] key,long offset,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setbit(key,offset,value);
    }
    
    public static java.lang.Boolean setbit(byte[] key,long offset,boolean value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setbit(key,offset,value);
    }
    
    public static java.lang.Boolean setbit(java.lang.String key,long offset,boolean value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setbit(key,offset,value);
    }
    
    public static java.lang.String setex(byte[] key,int seconds,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setex(key,seconds,value);
    }
    
    public static java.lang.String setex(java.lang.String key,int seconds,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setex(key,seconds,value);
    }
    
    public static java.lang.Long setnx(byte[] key,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setnx(key,value);
    }
    
    public static java.lang.Long setnx(java.lang.String key,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setnx(key,value);
    }
    
    public static java.lang.Long setrange(java.lang.String key,long offset,java.lang.String value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setrange(key,offset,value);
    }
    
    public static java.lang.Long setrange(byte[] key,long offset,byte[] value) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.setrange(key,offset,value);
    }
    
    public static java.lang.String shutdown() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.shutdown();
        } else {
            throw new JedisConnectionException("Cannot execute shutdown with sharded instance.");
        }
    }
    
    public static java.util.Set sinter(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinter(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinter with sharded instance.");
        }
    }
    
    public static java.util.Set sinter(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinter(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinter with sharded instance.");
        }
    }
    
    public static java.lang.Long sinterstore(java.lang.String dstkey,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinterstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinterstore with sharded instance.");
        }
    }
    
    public static java.lang.Long sinterstore(byte[] dstkey,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sinterstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sinterstore with sharded instance.");
        }
    }
    
    public static java.lang.Boolean sismember(java.lang.String key,java.lang.String member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sismember(key,member);
    }
    
    public static java.lang.Boolean sismember(byte[] key,byte[] member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sismember(key,member);
    }
    
    public static java.lang.String slaveof(java.lang.String host,int port) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slaveof(host,port);
        } else {
            throw new JedisConnectionException("Cannot execute slaveof with sharded instance.");
        }
    }
    
    public static java.lang.String slaveofNoOne() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slaveofNoOne();
        } else {
            throw new JedisConnectionException("Cannot execute slaveofNoOne with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGet() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGet();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGet with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGet(long entries) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGet(entries);
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGet with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGetBinary() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGetBinary();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGetBinary with sharded instance.");
        }
    }
    
    public static java.util.List slowlogGetBinary(long entries) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogGetBinary(entries);
        } else {
            throw new JedisConnectionException("Cannot execute slowlogGetBinary with sharded instance.");
        }
    }
    
    public static java.lang.Long slowlogLen() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogLen();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogLen with sharded instance.");
        }
    }
    
    public static java.lang.String slowlogReset() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.slowlogReset();
        } else {
            throw new JedisConnectionException("Cannot execute slowlogReset with sharded instance.");
        }
    }
    
    public static java.util.Set smembers(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.smembers(key);
    }
    
    public static java.util.Set smembers(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.smembers(key);
    }
    
    public static java.lang.Long smove(java.lang.String srckey,java.lang.String dstkey,java.lang.String member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smove(srckey,dstkey,member);
        } else {
            throw new JedisConnectionException("Cannot execute smove with sharded instance.");
        }
    }
    
    public static java.lang.Long smove(byte[] srckey,byte[] dstkey,byte[] member) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.smove(srckey,dstkey,member);
        } else {
            throw new JedisConnectionException("Cannot execute smove with sharded instance.");
        }
    }
    
    public static java.util.List sort(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sort(key);
    }
    
    public static java.util.List sort(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sort(key);
    }
    
    public static java.lang.Long sort(java.lang.String key,java.lang.String dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static java.util.List sort(byte[] key,redis.clients.jedis.SortingParams sortingParameters) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sort(key,sortingParameters);
    }
    
    public static java.util.List sort(java.lang.String key,redis.clients.jedis.SortingParams sortingParameters) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sort(key,sortingParameters);
    }
    
    public static java.lang.Long sort(byte[] key,byte[] dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static java.lang.Long sort(java.lang.String key,redis.clients.jedis.SortingParams sortingParameters,java.lang.String dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,sortingParameters,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static java.lang.Long sort(byte[] key,redis.clients.jedis.SortingParams sortingParameters,byte[] dstkey) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sort(key,sortingParameters,dstkey);
        } else {
            throw new JedisConnectionException("Cannot execute sort with sharded instance.");
        }
    }
    
    public static byte[] spop(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.spop(key);
    }
    
    public static java.lang.String spop(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.spop(key);
    }
    
    public static java.lang.String srandmember(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.srandmember(key);
    }
    
    public static byte[] srandmember(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.srandmember(key);
    }
    
    public static java.util.List srandmember(byte[] key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srandmember(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute srandmember with sharded instance.");
        }
    }
    
    public static java.util.List srandmember(java.lang.String key,int count) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.srandmember(key,count);
        } else {
            throw new JedisConnectionException("Cannot execute srandmember with sharded instance.");
        }
    }
    
    public static java.lang.Long srem(byte[] key,byte[][] member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.srem(key,member);
    }
    
    public static java.lang.Long srem(java.lang.String key,java.lang.String[] members) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.srem(key,members);
    }
    
    public static redis.clients.jedis.ScanResult sscan(java.lang.String key,java.lang.String cursor) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sscan(key,cursor);
    }
    
    public static redis.clients.jedis.ScanResult sscan(java.lang.String key,int cursor) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.sscan(key,cursor);
    }
    
    public static redis.clients.jedis.ScanResult sscan(java.lang.String key,java.lang.String cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute sscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.ScanResult sscan(java.lang.String key,int cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute sscan with sharded instance.");
        }
    }
    
    public static java.lang.Long strlen(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.strlen(key);
    }
    
    public static java.lang.Long strlen(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.strlen(key);
    }
    
    public static void subscribe(redis.clients.jedis.BinaryJedisPubSub jedisPubSub,byte[][] channels) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.subscribe(jedisPubSub,channels);
        } else {
            throw new JedisConnectionException("Cannot execute subscribe with sharded instance.");
        }
    }
    
    public static void subscribe(redis.clients.jedis.JedisPubSub jedisPubSub,java.lang.String[] channels) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.subscribe(jedisPubSub,channels);
        } else {
            throw new JedisConnectionException("Cannot execute subscribe with sharded instance.");
        }
    }
    
    public static byte[] substr(byte[] key,int start,int end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.substr(key,start,end);
    }
    
    public static java.lang.String substr(java.lang.String key,int start,int end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.substr(key,start,end);
    }
    
    public static java.util.Set sunion(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunion(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunion with sharded instance.");
        }
    }
    
    public static java.util.Set sunion(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunion(keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunion with sharded instance.");
        }
    }
    
    public static java.lang.Long sunionstore(byte[] dstkey,byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunionstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunionstore with sharded instance.");
        }
    }
    
    public static java.lang.Long sunionstore(java.lang.String dstkey,java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.sunionstore(dstkey,keys);
        } else {
            throw new JedisConnectionException("Cannot execute sunionstore with sharded instance.");
        }
    }
    
    public static void sync() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            jedis.sync();
        } else {
            throw new JedisConnectionException("Cannot execute sync with sharded instance.");
        }
    }
    
    public static java.util.List time() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.time();
        } else {
            throw new JedisConnectionException("Cannot execute time with sharded instance.");
        }
    }
    
    public static java.lang.Long ttl(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.ttl(key);
    }
    
    public static java.lang.Long ttl(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.ttl(key);
    }
    
    public static java.lang.String type(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.type(key);
    }
    
    public static java.lang.String type(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.type(key);
    }
    
    public static java.lang.String unwatch() {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.unwatch();
        } else {
            throw new JedisConnectionException("Cannot execute unwatch with sharded instance.");
        }
    }
    
    public static java.lang.Long waitReplicas(int replicas,long timeout) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.waitReplicas(replicas,timeout);
        } else {
            throw new JedisConnectionException("Cannot execute waitReplicas with sharded instance.");
        }
    }
    
    public static java.lang.String watch(byte[][] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.watch(keys);
        } else {
            throw new JedisConnectionException("Cannot execute watch with sharded instance.");
        }
    }
    
    public static java.lang.String watch(java.lang.String[] keys) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.watch(keys);
        } else {
            throw new JedisConnectionException("Cannot execute watch with sharded instance.");
        }
    }
    
    public static java.lang.Long zadd(byte[] key,java.util.Map scoreMembers) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zadd(key,scoreMembers);
    }
    
    public static java.lang.Long zadd(java.lang.String key,java.util.Map scoreMembers) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zadd(key,scoreMembers);
    }
    
    public static java.lang.Long zadd(java.lang.String key,double score,java.lang.String member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zadd(key,score,member);
    }
    
    public static java.lang.Long zadd(byte[] key,double score,byte[] member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zadd(key,score,member);
    }
    
    public static java.lang.Long zcard(java.lang.String key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zcard(key);
    }
    
    public static java.lang.Long zcard(byte[] key) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zcard(key);
    }
    
    public static java.lang.Long zcount(java.lang.String key,double min,double max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zcount(key,min,max);
    }
    
    public static java.lang.Long zcount(byte[] key,byte[] min,byte[] max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zcount(key,min,max);
    }
    
    public static java.lang.Long zcount(java.lang.String key,java.lang.String min,java.lang.String max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zcount(key,min,max);
    }
    
    public static java.lang.Long zcount(byte[] key,double min,double max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zcount(key,min,max);
    }
    
    public static java.lang.Double zincrby(byte[] key,double score,byte[] member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zincrby(key,score,member);
    }
    
    public static java.lang.Double zincrby(java.lang.String key,double score,java.lang.String member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zincrby(key,score,member);
    }
    
    public static java.lang.Long zinterstore(byte[] dstkey,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static java.lang.Long zinterstore(java.lang.String dstkey,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static java.lang.Long zinterstore(java.lang.String dstkey,redis.clients.jedis.ZParams params,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static java.lang.Long zinterstore(byte[] dstkey,redis.clients.jedis.ZParams params,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zinterstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zinterstore with sharded instance.");
        }
    }
    
    public static java.util.Set zrange(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrange(key,start,end);
    }
    
    public static java.util.Set zrange(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrange(key,start,end);
    }
    
    public static java.util.Set zrangeByScore(java.lang.String key,double min,double max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max);
    }
    
    public static java.util.Set zrangeByScore(byte[] key,byte[] min,byte[] max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max);
    }
    
    public static java.util.Set zrangeByScore(java.lang.String key,java.lang.String min,java.lang.String max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max);
    }
    
    public static java.util.Set zrangeByScore(byte[] key,double min,double max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max);
    }
    
    public static java.util.Set zrangeByScore(byte[] key,double min,double max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeByScore(java.lang.String key,java.lang.String min,java.lang.String max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeByScore(java.lang.String key,double min,double max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeByScore(byte[] key,byte[] min,byte[] max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScore(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeByScoreWithScores(java.lang.String key,double min,double max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max);
    }
    
    public static java.util.Set zrangeByScoreWithScores(java.lang.String key,java.lang.String min,java.lang.String max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max);
    }
    
    public static java.util.Set zrangeByScoreWithScores(byte[] key,double min,double max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max);
    }
    
    public static java.util.Set zrangeByScoreWithScores(byte[] key,byte[] min,byte[] max) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max);
    }
    
    public static java.util.Set zrangeByScoreWithScores(byte[] key,double min,double max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeByScoreWithScores(byte[] key,byte[] min,byte[] max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeByScoreWithScores(java.lang.String key,java.lang.String min,java.lang.String max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeByScoreWithScores(java.lang.String key,double min,double max,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeByScoreWithScores(key,min,max,offset,count);
    }
    
    public static java.util.Set zrangeWithScores(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeWithScores(key,start,end);
    }
    
    public static java.util.Set zrangeWithScores(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrangeWithScores(key,start,end);
    }
    
    public static java.lang.Long zrank(java.lang.String key,java.lang.String member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrank(key,member);
    }
    
    public static java.lang.Long zrank(byte[] key,byte[] member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrank(key,member);
    }
    
    public static java.lang.Long zrem(byte[] key,byte[][] members) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrem(key,members);
    }
    
    public static java.lang.Long zrem(java.lang.String key,java.lang.String[] members) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrem(key,members);
    }
    
    public static java.lang.Long zremrangeByRank(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zremrangeByRank(key,start,end);
    }
    
    public static java.lang.Long zremrangeByRank(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zremrangeByRank(key,start,end);
    }
    
    public static java.lang.Long zremrangeByScore(java.lang.String key,java.lang.String start,java.lang.String end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zremrangeByScore(key,start,end);
    }
    
    public static java.lang.Long zremrangeByScore(byte[] key,byte[] start,byte[] end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zremrangeByScore(key,start,end);
    }
    
    public static java.lang.Long zremrangeByScore(java.lang.String key,double start,double end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zremrangeByScore(key,start,end);
    }
    
    public static java.lang.Long zremrangeByScore(byte[] key,double start,double end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zremrangeByScore(key,start,end);
    }
    
    public static java.util.Set zrevrange(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrange(key,start,end);
    }
    
    public static java.util.Set zrevrange(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrange(key,start,end);
    }
    
    public static java.util.Set zrevrangeByScore(java.lang.String key,java.lang.String max,java.lang.String min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScore(java.lang.String key,double max,double min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScore(byte[] key,byte[] max,byte[] min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScore(byte[] key,double max,double min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScore(byte[] key,double max,double min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeByScore(java.lang.String key,java.lang.String max,java.lang.String min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeByScore(byte[] key,byte[] max,byte[] min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeByScore(java.lang.String key,double max,double min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScore(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(byte[] key,byte[] max,byte[] min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(java.lang.String key,double max,double min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(byte[] key,double max,double min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(java.lang.String key,java.lang.String max,java.lang.String min) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(byte[] key,byte[] max,byte[] min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(java.lang.String key,java.lang.String max,java.lang.String min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(java.lang.String key,double max,double min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeByScoreWithScores(byte[] key,double max,double min,int offset,int count) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);
    }
    
    public static java.util.Set zrevrangeWithScores(byte[] key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeWithScores(key,start,end);
    }
    
    public static java.util.Set zrevrangeWithScores(java.lang.String key,long start,long end) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrangeWithScores(key,start,end);
    }
    
    public static java.lang.Long zrevrank(byte[] key,byte[] member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrank(key,member);
    }
    
    public static java.lang.Long zrevrank(java.lang.String key,java.lang.String member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zrevrank(key,member);
    }
    
    public static redis.clients.jedis.ScanResult zscan(java.lang.String key,int cursor) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zscan(key,cursor);
    }
    
    public static redis.clients.jedis.ScanResult zscan(java.lang.String key,java.lang.String cursor) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zscan(key,cursor);
    }
    
    public static redis.clients.jedis.ScanResult zscan(java.lang.String key,java.lang.String cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute zscan with sharded instance.");
        }
    }
    
    public static redis.clients.jedis.ScanResult zscan(java.lang.String key,int cursor,redis.clients.jedis.ScanParams params) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zscan(key,cursor,params);
        } else {
            throw new JedisConnectionException("Cannot execute zscan with sharded instance.");
        }
    }
    
    public static java.lang.Double zscore(byte[] key,byte[] member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zscore(key,member);
    }
    
    public static java.lang.Double zscore(java.lang.String key,java.lang.String member) {
        Jedis jedis = RedisConnectionManager.getRawConnectionFromShard(key);
        return jedis.zscore(key,member);
    }
    
    public static java.lang.Long zunionstore(java.lang.String dstkey,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
    public static java.lang.Long zunionstore(byte[] dstkey,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
    public static java.lang.Long zunionstore(java.lang.String dstkey,redis.clients.jedis.ZParams params,java.lang.String[] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
    public static java.lang.Long zunionstore(byte[] dstkey,redis.clients.jedis.ZParams params,byte[][] sets) {
        if (!RedisConnectionManager.isSharded()) {
            Jedis jedis = RedisConnectionManager.getRawConnectionInternal();
            return jedis.zunionstore(dstkey,params,sets);
        } else {
            throw new JedisConnectionException("Cannot execute zunionstore with sharded instance.");
        }
    }
    
}